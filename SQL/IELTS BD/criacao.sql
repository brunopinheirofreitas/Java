drop table if exists ieltsbooks.LIVRO cascade;

 

drop table if exists ieltsbooks.SECTION cascade;

 

drop table if exists ieltsbooks.SKILL cascade;

 

drop table if exists ieltsbooks.SKILL_SECTION cascade;

 

drop table if exists ieltsbooks.TESTE cascade;

 

/*==============================================================*/

/* Table: LIVRO                                                 */

/*==============================================================*/

create table ieltsbooks.LIVRO (

NU_LIVRO             integer              not null,

NO_LIVRO             text                 null,

constraint PK_LIVRO primary key (NU_LIVRO)

);

 

/*==============================================================*/

/* Table: SECTION                                               */

/*==============================================================*/

create table ieltsbooks.SECTION (

NU_SECTION           integer              not null default 0,

NU_TESTE             integer              null,

NO_SECTION           text                 null,

constraint PK_SECTION primary key (NU_SECTION)

);

 

/*==============================================================*/

/* Table: SKILL                                                 */

/*==============================================================*/

create table ieltsbooks.SKILL (

NU_SKILL             integer              not null default 0,

NO_SKILL             text                 null,

constraint PK_SKILL primary key (NU_SKILL)

);

 

/*==============================================================*/

/* Table: SKILL_SECTION                                         */

/*==============================================================*/

create table ieltsbooks.SKILL_SECTION (

NU_SECTION           integer              null default 0,

NU_SKILL             integer              null

);

 

/*==============================================================*/

/* Table: TESTE                                                 */

/*==============================================================*/

create table ieltsbooks.TESTE (

NU_TESTE             integer              not null default 0,

NU_LIVRO             integer              null,

NO_TESTE             text                 null,

constraint PK_TESTE primary key (NU_TESTE)

);

 

alter table ieltsbooks.SECTION

   add constraint FK_SECTION_REFERENCE_TESTE foreign key (NU_TESTE)

      references ieltsbooks.TESTE (NU_TESTE)

      on delete restrict on update restrict;

 

alter table ieltsbooks.SKILL_SECTION

   add constraint FK_SKILL_SE_REFERENCE_SECTION foreign key (NU_SECTION)

      references ieltsbooks.SECTION (NU_SECTION)

      on delete restrict on update restrict;

 

alter table ieltsbooks.SKILL_SECTION

   add constraint FK_SKILL_SE_REFERENCE_SKILL foreign key (NU_SKILL)

      references ieltsbooks.SKILL (NU_SKILL)

      on delete restrict on update restrict;

 

alter table ieltsbooks.TESTE

   add constraint FK_TESTE_REFERENCE_LIVRO foreign key (NU_LIVRO)

      references ieltsbooks.LIVRO (NU_LIVRO)

      on delete restrict on update restrict;

