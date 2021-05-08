use farm_project;

create table vegetable
(
    id         int auto_increment primary key,
    veg_name   varchar(30) not null,
    quantity   varchar(30) not null,
    price      varchar(30) not null,
    expire     varchar(30) not null
);

create table fruits
(
    id           int auto_increment primary key,
    fruit_name   varchar(30) not null,
    quantity     varchar(30) not null,
    price        varchar(30) not null,
    expire       varchar(30) not null
);

create table animals
(
    id            int auto_increment primary key,
    animal_name   varchar(30) not null,
    quantity      varchar(30) not null,
    price         varchar(30) not null,
    age           varchar(30) not null
);

create table flowers
(
    id            int auto_increment primary key,
    flower_name   varchar(30) not null,
    quantity      varchar(30) not null,
    price         varchar(30) not null,
    expire        varchar(30) not null,
    colour        varchar(30) not null,
    pack          varchar(30) not null
);

create table trees
(
     id            int auto_increment primary key,
     tree_name     varchar(30) not null,
     quantity      varchar(30) not null,
     price         varchar(30) not null,
     age           varchar(30) not null
);

create table orders
(
    id bigint auto_increment
        primary key,
    animal_Id int,
    CONSTRAINT FK_animalId FOREIGN KEY (animal_Id)
        REFERENCES animals(id) ,
    flower_Id int,
    CONSTRAINT FK_flowerId FOREIGN KEY (flower_Id)
        REFERENCES flowers(id),
    fruit_Id int,
    CONSTRAINT FK_fruitId FOREIGN KEY (fruit_Id)
        REFERENCES fruits(id),
    tree_Id int,
    CONSTRAINT FK_treeId FOREIGN KEY (tree_Id)
        REFERENCES trees(id),
    vegetable_Id int,
    CONSTRAINT FK_vegId FOREIGN KEY (vegetable_Id)
        REFERENCES vegetable(id)
);

