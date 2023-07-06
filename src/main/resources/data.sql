insert into pizzas (NAME, IMAGE, MASS, DESC, PRICE) values
('ПИЦЦА ФИЛАДЕЛЬФИЯ 30 СМ', 'preview_631863ef8ff9e.png', 440, 'Основа для пиццы, итальянский соус, сыр, форель слабосоленая, творожный сыр, кунжут, руккола', 2650);
insert into pizzas (NAME, IMAGE, MASS, DESC, PRICE) values
('ПИЦЦА ТОННО ЧИПОЛЛО 30СМ', 'preview_63ff380a44ac2.png', 472, 'Основа для пиццы, итальянский соус, сыр, тунец консервированный, помидоры, лук, оливки, стружка тунца, руккола', 2390);
insert into pizzas (NAME, IMAGE, MASS, DESC, PRICE) values
('ПИЦЦА СОРЕНТО 30СМ', 'preview_63ff384743b1d.png', 484, 'Основа для пиццы, оливковый соус, сыр, ветчина, куриное филе маринованное, шампиньоны, маринованные опята и огурцы, зелень', 1870);
insert into pizzas (NAME, IMAGE, MASS, DESC, PRICE) values
('ПИЦЦА МАРГАРИТА 30 СМ', 'preview_61e119b9560a5.png', 500, 'Основа для пиццы, моцарелла, пармезан, черри, базилик, соус томатный, масло оливковое', 2480);
insert into pizzas (NAME, IMAGE, MASS, DESC, PRICE) values
('ПИЦЦА ПРИМАВЕРА 30СМ', 'preview_609273a4c9874.png', 425, 'Куриное филе маринованное, креветки, твёрдый сыр , мягкий сливочный сыр, томаты черри, свежая руккола, маслины, сушеный орегано, основа для пиццы', 2140);
insert into pizzas (NAME, IMAGE, MASS, DESC, PRICE) values
('ПИЦЦА КРЕМОЗО 30СМ', 'preview_6092747f7ed35.png', 450, 'Ветчина, салями пепперони, твёрдый сыр, мягкий сливочный сыр, томаты черри, свежая руккола', 1870);
insert into pizzas (NAME, IMAGE, MASS, DESC, PRICE) values
('ПИЦЦА ГРУША ДОРБЛЮ 30СМ', 'preview_6414081a49644.png', 420, 'Мягкий сливочный сыр, моцарелла, сыр Дор Блю, груша, вяленый томат, руккола, медово-лимонная заправка', 1820);
insert into pizzas (NAME, IMAGE, MASS, DESC, PRICE) values
('ШЕФ-ПИЦЦА ЯКУШЕВА ПОЛУОСТРАЯ 30 СМ', 'preview_5cc6af1b7176e.png', 480, 'Копчёная грудинка, куриное маринованное филе, репчатый лук, твёрдый сыр, томатный соус, медовый соус, кунжут, острый консервированный перец, основа для пиццы', 1790);

insert into clients (NAME, login, phone, email, address, password) values
('user', 'user', 'user@gmail.com', '+37529-1234567', 'Vitebsk, Pobedy st., 21', '$2a$10$30k9Zm7t7ICejWH.akT4auhQiLOKT2Iw344.AfO8Fd8mphj8c/5wi');
insert into clients (NAME, login, phone, email, address, password) values
('guest', 'guest', 'guest@gmail.com', '+37529-1234568', 'Vitebsk, Moskowsky st., 21', '$2a$10$jfWCmy/N8JNr8gObRh8VqegWghteTI/aKM2NKJIBW.H3xvTY9Tf5K');
insert into clients (NAME, login, phone, email, address, password) values
('root', 'root', 'root@gmail.com', '+37529-1234569', 'Vitebsk, Moskowsky st., 22', '$2a$10$6pe0GX6McE5ST.WIS3OnyuC7y4a37r9Er8Jq7vfuqt25GKjmISt0S');

insert into orders (date, status, client_id) values ('2023-05-05T11:50:55', 'A', 1);
insert into orders (date, status, client_id) values ('2023-05-05T11:50:55', 'A', 2);

insert into order_details (order_id, pizza_id, count) values (1, 1, 1);
insert into order_details (order_id, pizza_id, count) values (1, 2, 2);