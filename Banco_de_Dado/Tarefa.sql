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