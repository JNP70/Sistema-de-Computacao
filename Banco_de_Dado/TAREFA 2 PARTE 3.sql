CREATE TABLE departamento (
  Dnome        varchar(25) not null,
  Dnumero      integer,
  Cpf_gerente       char(11) not null, 
  Data_inicio_gerente date,
  primary key (Dnumero),
  unique (Dnome)
);

CREATE TABLE funcionario (
  Pnome    varchar(15) not null, 
  Minicial    varchar(1),
  Unome    varchar(15) not null,
  Cpf      char(11),
  Datanasc    date,
  Endereco  varchar(50),
  sexo      char,
  salario   decimal(10,2),
  Cpf_supervisor char(11),
  Dnr      integer,
  primary key (Cpf),
  foreign key (Cpf_supervisor) references funcionario(Cpf),
  foreign key (Dnr) references departamento(Dnumero)
);

CREATE TABLE dependente (
  FCpf           char(11),
  Nome_dependente varchar(15),
  sexo            char,
  Datanasc          date,
  Parentesco   varchar(8),
  primary key (FCpf,Nome_dependente),
  foreign key (FCpf) references funcionario(Cpf)
);

CREATE TABLE projeto (
  Projnome      varchar(25) not null,
  Projnumero    integer,
  Projlocal  varchar(15),
  dnum       integer not null,
  primary key (Projnumero),
  unique (Projnome),
  foreign key (dnum) references departamento(Dnumero)
);

CREATE TABLE trabalha_em (
  FCpf   char(11),
  Projnumero    integer,
  Horas  decimal(4,1),
  primary key (FCpf,Projnumero),
  foreign key (FCpf) references funcionario(Cpf),
  foreign key (Projnumero) references projeto(Projnumero)
);

CREATE TABLE localizacao_dep (
  Dnumero   integer,
  Dlocal varchar(15), 
  primary key (Dnumero,Dlocal),
  foreign key (Dnumero) references departamento(Dnumero)
);

INSERT INTO departamento(dnome, dnumero, cpf_gerente, data_inicio_gerente) VALUES 
('Pesquisa','5', null, null),
('Administração','4', null, null),
('Matriz','1', null, null);

INSERT INTO funcionario(pnome, minicial, unome, cpf, datanasc, endereco, sexo, salario, cpf_supervisor, dnr) VALUES 
('James', 'E', 'Borg', '88866555576', '10-11-1937', '450 Stones, Houston, TX', 'M', 5500, null, 1),
('Jennifer', 'S', 'Wallace', '98765432168', '20-06-1941', '291 Berry, Bellaire, TX', 'F', 4300, '88866555576', 4),
('Franklin', 'T', 'Wong', '33344555587', '08-12-1955', '638 Voss, Houston, TX', 'M', 4000, '88866555576', 5),
('John', 'B', 'Smith', '12345678966', '09-01-1965','731 Fondren, Houston, TX', 'M', 3000, '33344555587', 5),
('Ramesh', 'K', 'Narayan', '66688444476', '15-09-1962','975 Fire Oak, Humble, TX', 'M', 3800, '33344555587', 5),
('Joice', 'A', 'English', '45345345376', '31-07-1976','5631 Rice Houston, TX', 'F', 2500, '33344555587', 5),
('Alice', 'J', 'Zelaya', '99988777767', '10-01-1968','3321 Castle, Spring, TX', 'F', 2500, '98765432168', 4),
('Ahmad', 'V', 'Jabar', '98798798733', '29-03-1969','980 Dallas, Houston, TX', 'M', 2500, '98765432168', 4);


INSERT INTO projeto(projnome, projnumero, projlocal, dnum) VALUES
('ProdutoX', 1, 'Bellaire', 5),
('ProdutoY', 2, 'Sugarland', 5),
('ProdutoZ', 3, 'Houston', 5),
('Informatização', 10, 'Stafford', 4),
('Reorganização', 20, 'Houston', 1),
('Qualidade', 30, 'Stafford', 4);


INSERT INTO public.dependente(fcpf, nome_dependente, sexo, datanasc, parentesco) VALUES
('33344555587', 'Alice', 'F', '05-04-1986', 'Filha'),
('33344555587', 'Theodore', 'M', '25-10-1983', 'Filho'),
('33344555587', 'Joy', 'F', '03-05-1958', 'Conjuge'),
('98765432168', 'Abner', 'M', '28-02-1942', 'Conjuge'),
('12345678966', 'Michael', 'M', '04-01-1988', 'Filho'),
('12345678966', 'Alice', 'F', '30-12-1988', 'Filha'),
('12345678966', 'Elizabeth', 'F', '05-05-1967', 'Conjuge');

INSERT INTO localizacao_dep(dnumero, dlocal) values
(1, 'Houston'),
(4, 'Stafford'),
(5, 'Bellaire'),
(5, 'Sugarland'),

INSERT INTO trabalha_em(fcpf, projnumero, horas) VALUES 
('12345678966', 1, 32.5),
('12345678966', 2, 7.5),
('66688444476', 3, 40.0),
('45345345376', 1, 20.0),
('45345345376', 2, 20.0),
('33344555587', 2, 10.0),
('33344555587', 3, 10.0),
('33344555587', 10, 10.0),
('33344555587', 20, 10.0),
('99988777767', 30, 30.0),
('99988777767', 10, 10.0),
('98798798733', 10, 35.0),
('98798798733', 30, 5.0),
('98765432168', 30, 20.0),
('98765432168', 20, 15.0),


SELECT pnome, unome, endereco
FROM 	FUNCIONARIO, DEPARTAMENTO
WHERE 	Dnome='PESQUISA' AND Dnumero=Dnr;

SELECT Projnome, Dnome
FROM projeto, departamento
WHERE Projlocal='Stafford' AND Dnum=Dnumero;

SELECT F.pnome, F.unome, S.pnome, S.unome
FROM funcionario as f, funcionario as s
WHERE F.Cpf_supervisor = S.Cpf_supervisor;

SELECT ALL salario
FROM funcionario;

SELECT DISTINCT salario
FROM funcionario;

SELECT pnome, unome
FROM funcionario
WHERE endereco like '%Houston, TX';

SELECT pnome, unome
FROM funcionario
WHERE (datanasc BETWEEN '1960-01-01' AND '1969-12-31'); 

SELECT  pnome, unome, Dnr
FROM	funcionario
WHERE	(salario BETWEEN 3000 AND 4000) AND Dnr='5';

SELECT  pnome, unome
FROM	funcionario
ORDER BY pnome ASC, unome;

SELECT  pnome, unome
FROM	funcionario
WHERE Cpf_supervisor is null;

SELECT   DISTINCT (Cpf), pnome, unome, Fcpf
FROM	funcionario, dependente
WHERE 	Fcpf = Cpf_supervisor;

DELETE FROM dependente
WHERE nome_dependente = 'Theodore';

UPDATE funcionario
SET Salario = Salario * 1.5
WHERE Dnr = 4;

UPDATE departamento
SET cpf_gerente = '33344555587' data_inicio_gerente = 22-05-1988
WHERE dnumero = 5;

UPDATE departamento
SET data_inicio_gerente = 22-05-1988
WHERE dnumero = 5;