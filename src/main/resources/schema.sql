create table if not exists Ingredient (
  id identity,
  name varchar(25) not null
);


create table if not exists MealType (
  id identity,
  name varchar(25) not null
);

create table if not exists Meal (
  id identity,
  name varchar(25) not null
);

create table if not exists Meal_Ingredients (
  meal bigint not null,
  ingredient bigint not null
);

alter table Meal_Ingredients add foreign key (meal) references Meal(id);
alter table Meal_Ingredients add foreign key (ingredient) references Ingredient(id);