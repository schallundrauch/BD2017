*Befehle

*sudo -u neymar time hadoop jar /opt/cloudera/parcels/CDH-5.11.1-1.cdh5.11.1.p0.4/lib/hadoop-0.20-mapreduce/hadoop-examples-2.6.0-mr1-cdh5.11.1.jar teragen -Ddfs.block.size=16777216 -Dmapred.reduce.tasks=8  65536000 /user/neymar/tgen640

[ec2-user@ip-172-31-15-220 hadoop-0.20-mapreduce]$ hdfs dfs -ls /user/neymar/tgen640
Found 3 items
-rw-r--r--   3 neymar supergroup          0 2017-07-06 13:04 /user/neymar/tgen640/_SUCCESS
-rw-r--r--   3 neymar supergroup 3276800000 2017-07-06 13:04 /user/neymar/tgen640/part-m-00000
-rw-r--r--   3 neymar supergroup 3276800000 2017-07-06 13:04 /user/neymar/tgen640/part-m-00001




