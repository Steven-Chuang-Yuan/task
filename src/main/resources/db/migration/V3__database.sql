CREATE TABLE public.city
(
     id integer,
     province_id integer,
     city_name character(10),
     city_description character(10)
);
ALTER TABLE public.city
    OWNER to postgres;