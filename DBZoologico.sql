PGDMP     &    &                 y            DBZoologico    13.2    13.2     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16584    DBZoologico    DATABASE     l   CREATE DATABASE "DBZoologico" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Colombia.1252';
    DROP DATABASE "DBZoologico";
                postgres    false            ?            1259    16636    animal    TABLE     m   CREATE TABLE public.animal (
    id integer NOT NULL,
    nombre text,
    tipo integer,
    edad integer
);
    DROP TABLE public.animal;
       public         heap    postgres    false            ?            1259    16619    animal_id_seq    SEQUENCE     v   CREATE SEQUENCE public.animal_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.animal_id_seq;
       public          postgres    false            ?            1259    16634    animal_id_seq1    SEQUENCE     ?   CREATE SEQUENCE public.animal_id_seq1
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.animal_id_seq1;
       public          postgres    false    202            ?           0    0    animal_id_seq1    SEQUENCE OWNED BY     @   ALTER SEQUENCE public.animal_id_seq1 OWNED BY public.animal.id;
          public          postgres    false    201            %           2604    16639 	   animal id    DEFAULT     g   ALTER TABLE ONLY public.animal ALTER COLUMN id SET DEFAULT nextval('public.animal_id_seq1'::regclass);
 8   ALTER TABLE public.animal ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    202    201    202            ?          0    16636    animal 
   TABLE DATA           8   COPY public.animal (id, nombre, tipo, edad) FROM stdin;
    public          postgres    false    202          ?           0    0    animal_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.animal_id_seq', 1, false);
          public          postgres    false    200            ?           0    0    animal_id_seq1    SEQUENCE SET     <   SELECT pg_catalog.setval('public.animal_id_seq1', 3, true);
          public          postgres    false    201            ?   (   x?3??/*)MO?4?4?2?tL/??I?4?4?????? ?R_     