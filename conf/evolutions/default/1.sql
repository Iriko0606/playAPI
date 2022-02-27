# ---!Ups
create table recipie.user (
                              id int auto_increment primary key,
                              name varchar(255) not null,
                              mail varchar(255) not null,
                              tel varchar(255)
);

insert into recipie.user values
                             (default, 'taro', 'taro@yamada', '999-999-999'),
                             (default, 'hanako', 'hanako@flower', '888-888-888'),
                             (default, 'sachiko', 'sachiko@flower', '777-777-777');