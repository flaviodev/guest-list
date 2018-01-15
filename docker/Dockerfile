FROM postgres:9.5


# instalando locale pt_BR
RUN localedef -i pt_BR -c -f UTF-8 -A /usr/share/locale/locale.alias pt_BR.UTF-8
ENV LANG pt_BR.UTF-8

	
ADD files/pg_hba.conf /var/lib/postgresql/data/pg_hba.conf
COPY files/postgresql.conf /backup/postgresql.conf

ADD files/init-db.sh /docker-entrypoint-initdb.d

EXPOSE 5432