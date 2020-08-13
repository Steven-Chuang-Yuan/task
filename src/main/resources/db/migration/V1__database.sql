
CREATE TABLE public.role(
     id character (10),
     name character (10)

);
ALTER TABLE public.role
OWNER to postgres;

CREATE TABLE public.User(
     id SERIAL  PRIMARY KEY,
     username character (10),
     password character (10)

);
ALTER TABLE public.User
OWNER to postgres;

CREATE TABLE public.role_user(

     roleId character (10) ,
     userId character (10)

);
ALTER TABLE public.role_user
OWNER to postgres;