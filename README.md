# CRUD DE DESPESAS JAVA

> Crud com conexão com banco de dados postgresSQL
> 
> Para voce fazer a conexão com o seu banco de dados vá em:
> 
> PACKAGE INFRA:-> ConnectionFactory
> 
> Dentro da classe ConnectionFactory altere o DriverManage.getConnection
> 
> Coloque o usuario do seu banco de dados e a senha.

# BANCO DE DADOS

> Para criar a tabela no banco de dados de acordo com os dados que esta na classe use este codigo:

```
create table despesas(
    id bigserial primary key,
    descricao varchar(100),
    data date,
    valor decimal(10,2),
    categoria varchar(60)
);
```
> copie e cole esse codigo no Query Tool.
