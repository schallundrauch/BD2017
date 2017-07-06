[ec2-user@ip-172-31-9-108 ~]$ hostname
ip-172-31-9-108.eu-central-1.compute.internal

[ec2-user@ip-172-31-9-108 ~]$ mysql -V
mysql  Ver 15.1 Distrib 5.5.56-MariaDB, for Linux (x86_64) using readline 5.1

MariaDB [(none)]> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| cloudera           |
| hue                |
| metastore          |
| mysql              |
| oozie              |
| performance_schema |
| rman               |
| sentry             |
+--------------------+
9 rows in set (0.00 sec)

