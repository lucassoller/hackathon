drop table amizade;
drop table curtida;
drop table comentario;
drop table post;
drop table usuario;

CREATE TABLE USUARIO (
    ID_USUARIO NUMBER (10) NOT NULL,
    NOME_COMPLETO VARCHAR2 (255) NOT NULL,
    EMAIL VARCHAR2 (255) NOT NULL,
    APELIDO VARCHAR2 (50),
    DATA_NASCIMENTO DATE NOT NULL,
    SENHA VARCHAR2 (128) NOT NULL,
    IMAGEM VARCHAR (512)
) ;
CREATE SEQUENCE USUARIO_SEQ;
ALTER TABLE USUARIO ADD CONSTRAINT USU_PK PRIMARY KEY ( ID_USUARIO ) ;
ALTER TABLE USUARIO ADD CONSTRAINT USU_EMAIL_UK UNIQUE ( EMAIL ) ;

CREATE TABLE POST (
    ID_POST NUMBER (10) NOT NULL,
    DATA_POSTAGEM DATE NOT NULL,
    POSTAGEM VARCHAR(500) NOT NULL,
    PRIVACIDADE VARCHAR (13) NOT NULL,
    ID_USUARIO NUMBER (10) NOT NULL
) ;
CREATE SEQUENCE POST_SEQ;
ALTER TABLE POST ADD CONSTRAINT POST_PK PRIMARY KEY ( ID_POST ) ;
ALTER TABLE POST ADD CONSTRAINT POST_USU_FK FOREIGN KEY ( ID_USUARIO ) REFERENCES USUARIO (ID_USUARIO) ;

CREATE TABLE CURTIDA (
    ID_CURTIDA NUMBER (10) NOT NULL,
    ID_POST NUMBER (10) NOT NULL,
    ID_USUARIO NUMBER (10) NOT NULL
) ;
CREATE SEQUENCE CURTIDA_SEQ;
ALTER TABLE CURTIDA ADD CONSTRAINT CURTIDA_PK PRIMARY KEY ( ID_CURTIDA ) ;
ALTER TABLE CURTIDA ADD CONSTRAINT CURTIDA_USU_FK FOREIGN KEY ( ID_USUARIO ) REFERENCES USUARIO (ID_USUARIO) ;
ALTER TABLE CURTIDA ADD CONSTRAINT CURTIDA_POST_FK FOREIGN KEY ( ID_POST ) REFERENCES POST (ID_POST) ;


CREATE TABLE COMENTARIO (
    ID_COMENTARIO NUMBER (10) NOT NULL,
    ID_POST NUMBER (10) NOT NULL,
    ID_USUARIO NUMBER (10) NOT NULL,
    COMENTARIO VARCHAR (200) NOT NULL,
    DATA_COMENTARIO DATE NOT NULL
) ;
CREATE SEQUENCE COMENTARIO_SEQ;
ALTER TABLE COMENTARIO ADD CONSTRAINT COMENTARIO_PK PRIMARY KEY ( ID_COMENTARIO ) ;
ALTER TABLE COMENTARIO ADD CONSTRAINT COMENTARIO_USU_FK FOREIGN KEY ( ID_USUARIO ) REFERENCES USUARIO (ID_USUARIO) ;
ALTER TABLE COMENTARIO ADD CONSTRAINT COMENTARIO_POST_FK FOREIGN KEY ( ID_POST ) REFERENCES POST (ID_POST) ;

CREATE TABLE AMIZADE (
    ID_AMIZADE NUMBER (10) NOT NULL,
    ID_USUARIO_REMETENTE NUMBER (10) NOT NULL,
    ID_USUARIO_DESTINATARIO NUMBER (10) NOT NULL,
    STATUS VARCHAR (20) NOT NULL
) ;

selectt * from amizade;
CREATE SEQUENCE AMIZADE_SEQ;
ALTER TABLE AMIZADE ADD CONSTRAINT AMIZADE_PK PRIMARY KEY ( ID_AMIZADE ) ;
ALTER TABLE AMIZADE ADD CONSTRAINT AMZ_USU_REM_FK FOREIGN KEY ( ID_USUARIO_REMETENTE ) REFERENCES USUARIO (ID_USUARIO) ;
ALTER TABLE AMIZADE ADD CONSTRAINT AMZ_USU_DEST_FK FOREIGN KEY ( ID_USUARIO_DESTINATARIO ) REFERENCES USUARIO (ID_USUARIO) ;
