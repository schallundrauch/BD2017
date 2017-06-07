time hadoop jar hadoop-mapreduce-examples.jar teragen -Ddfs.block.size=16777216 -Dmapred.map.tasks=6 - 50000000 /user/schallundrauch/test1

real	3m39.869s
user	0m6.201s
sys	0m2.697s


[schallundrauch@quickstart hadoop-mapreduce]$ time hadoop jar hadoop-mapreduce-examples.jar terasort /user/schallundrauch/test1 /user/schallundrauch/testsort
17/05/18 02:43:20 INFO terasort.TeraSort: starting
17/05/18 02:43:22 INFO input.FileInputFormat: Total input paths to process : 6
Spent 300ms computing base-splits.
Spent 4ms computing TeraScheduler splits.
Computing input splits took 306ms
Sampling 10 splits of 300
Making 1 from 100000 sampled records
Computing parititions took 1446ms
Spent 1756ms computing partitions.
17/05/18 02:43:24 INFO client.RMProxy: Connecting to ResourceManager at /0.0.0.0:8032
17/05/18 02:43:26 INFO mapreduce.JobSubmitter: number of splits:300
17/05/18 02:43:26 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1495100426727_0001
17/05/18 02:43:27 INFO impl.YarnClientImpl: Submitted application application_1495100426727_0001
17/05/18 02:43:28 INFO mapreduce.Job: The url to track the job: http://quickstart.cloudera:8088/proxy/application_1495100426727_0001/
17/05/18 02:43:28 INFO mapreduce.Job: Running job: job_1495100426727_0001
17/05/18 02:43:47 INFO mapreduce.Job: Job job_1495100426727_0001 running in uber mode : false
17/05/18 02:43:47 INFO mapreduce.Job:  map 0% reduce 0%
17/05/18 02:44:24 INFO mapreduce.Job:  map 1% reduce 0%
17/05/18 02:44:35 INFO mapreduce.Job:  map 2% reduce 0%
17/05/18 02:45:06 INFO mapreduce.Job:  map 3% reduce 0%
17/05/18 02:45:08 INFO mapreduce.Job:  map 4% reduce 0%
17/05/18 02:45:40 INFO mapreduce.Job:  map 6% reduce 0%
17/05/18 02:46:11 INFO mapreduce.Job:  map 7% reduce 0%
17/05/18 02:46:12 INFO mapreduce.Job:  map 8% reduce 0%
17/05/18 02:46:43 INFO mapreduce.Job:  map 10% reduce 0%
17/05/18 02:47:14 INFO mapreduce.Job:  map 12% reduce 0%
17/05/18 02:47:48 INFO mapreduce.Job:  map 13% reduce 0%
17/05/18 02:47:49 INFO mapreduce.Job:  map 14% reduce 0%
17/05/18 02:48:19 INFO mapreduce.Job:  map 15% reduce 0%
17/05/18 02:48:20 INFO mapreduce.Job:  map 16% reduce 0%
17/05/18 02:48:51 INFO mapreduce.Job:  map 18% reduce 0%
17/05/18 02:49:21 INFO mapreduce.Job:  map 20% reduce 0%
17/05/18 02:49:52 INFO mapreduce.Job:  map 21% reduce 0%
17/05/18 02:49:53 INFO mapreduce.Job:  map 22% reduce 2%
17/05/18 02:49:59 INFO mapreduce.Job:  map 22% reduce 3%
17/05/18 02:50:12 INFO mapreduce.Job:  map 22% reduce 4%
17/05/18 02:50:18 INFO mapreduce.Job:  map 22% reduce 6%
17/05/18 02:50:31 INFO mapreduce.Job:  map 23% reduce 6%
17/05/18 02:50:36 INFO mapreduce.Job:  map 23% reduce 8%
17/05/18 02:51:10 INFO mapreduce.Job:  map 25% reduce 8%
17/05/18 02:51:45 INFO mapreduce.Job:  map 26% reduce 8%
17/05/18 02:51:46 INFO mapreduce.Job:  map 27% reduce 8%
17/05/18 02:51:54 INFO mapreduce.Job:  map 27% reduce 9%
17/05/18 02:52:17 INFO mapreduce.Job:  map 28% reduce 9%
17/05/18 02:52:51 INFO mapreduce.Job:  map 29% reduce 9%
17/05/18 02:52:52 INFO mapreduce.Job:  map 30% reduce 9%
17/05/18 02:52:54 INFO mapreduce.Job:  map 30% reduce 10%
17/05/18 02:53:22 INFO mapreduce.Job:  map 31% reduce 10%
17/05/18 02:53:25 INFO mapreduce.Job:  map 32% reduce 10%
17/05/18 02:53:35 INFO mapreduce.Job:  map 32% reduce 11%
17/05/18 02:53:57 INFO mapreduce.Job:  map 33% reduce 11%
17/05/18 02:54:25 INFO mapreduce.Job:  map 34% reduce 11%
17/05/18 02:54:26 INFO mapreduce.Job:  map 35% reduce 11%
17/05/18 02:54:31 INFO mapreduce.Job:  map 35% reduce 12%
17/05/18 02:55:00 INFO mapreduce.Job:  map 37% reduce 12%
17/05/18 02:55:29 INFO mapreduce.Job:  map 38% reduce 12%
17/05/18 02:55:34 INFO mapreduce.Job:  map 38% reduce 13%
17/05/18 02:55:56 INFO mapreduce.Job:  map 39% reduce 13%
17/05/18 02:55:58 INFO mapreduce.Job:  map 40% reduce 13%
17/05/18 02:56:26 INFO mapreduce.Job:  map 41% reduce 13%
17/05/18 02:56:27 INFO mapreduce.Job:  map 42% reduce 13%
17/05/18 02:56:30 INFO mapreduce.Job:  map 42% reduce 14%
17/05/18 02:56:53 INFO mapreduce.Job:  map 43% reduce 14%
17/05/18 02:57:21 INFO mapreduce.Job:  map 44% reduce 14%
17/05/18 02:57:22 INFO mapreduce.Job:  map 45% reduce 14%
17/05/18 02:57:25 INFO mapreduce.Job:  map 45% reduce 15%
17/05/18 02:57:50 INFO mapreduce.Job:  map 46% reduce 15%
17/05/18 02:57:53 INFO mapreduce.Job:  map 47% reduce 15%
17/05/18 02:57:57 INFO mapreduce.Job:  map 47% reduce 16%
17/05/18 02:58:32 INFO mapreduce.Job:  map 48% reduce 16%
17/05/18 02:59:10 INFO mapreduce.Job:  map 50% reduce 16%
17/05/18 02:59:17 INFO mapreduce.Job:  map 50% reduce 17%
17/05/18 02:59:46 INFO mapreduce.Job:  map 51% reduce 17%
17/05/18 02:59:47 INFO mapreduce.Job:  map 52% reduce 17%
17/05/18 03:00:19 INFO mapreduce.Job:  map 53% reduce 17%
17/05/18 03:00:25 INFO mapreduce.Job:  map 53% reduce 18%
17/05/18 03:00:54 INFO mapreduce.Job:  map 55% reduce 18%
17/05/18 03:01:22 INFO mapreduce.Job:  map 56% reduce 18%
17/05/18 03:01:24 INFO mapreduce.Job:  map 57% reduce 18%
17/05/18 03:01:27 INFO mapreduce.Job:  map 57% reduce 19%
17/05/18 03:01:56 INFO mapreduce.Job:  map 58% reduce 19%
17/05/18 03:02:25 INFO mapreduce.Job:  map 59% reduce 19%
17/05/18 03:02:27 INFO mapreduce.Job:  map 60% reduce 19%
17/05/18 03:02:29 INFO mapreduce.Job:  map 60% reduce 20%
17/05/18 03:02:55 INFO mapreduce.Job:  map 61% reduce 20%
17/05/18 03:02:56 INFO mapreduce.Job:  map 62% reduce 20%
17/05/18 03:02:59 INFO mapreduce.Job:  map 62% reduce 21%
17/05/18 03:03:23 INFO mapreduce.Job:  map 63% reduce 21%
17/05/18 03:03:57 INFO mapreduce.Job:  map 64% reduce 21%
17/05/18 03:03:58 INFO mapreduce.Job:  map 65% reduce 21%
17/05/18 03:04:00 INFO mapreduce.Job:  map 65% reduce 22%
17/05/18 03:04:29 INFO mapreduce.Job:  map 66% reduce 22%
17/05/18 03:04:30 INFO mapreduce.Job:  map 67% reduce 22%
17/05/18 03:05:01 INFO mapreduce.Job:  map 68% reduce 22%
17/05/18 03:05:03 INFO mapreduce.Job:  map 68% reduce 23%
17/05/18 03:05:31 INFO mapreduce.Job:  map 69% reduce 23%
17/05/18 03:05:32 INFO mapreduce.Job:  map 70% reduce 23%
17/05/18 03:06:06 INFO mapreduce.Job:  map 72% reduce 23%
17/05/18 03:06:12 INFO mapreduce.Job:  map 72% reduce 24%
17/05/18 03:06:36 INFO mapreduce.Job:  map 73% reduce 24%
17/05/18 03:07:05 INFO mapreduce.Job:  map 74% reduce 24%
17/05/18 03:07:06 INFO mapreduce.Job:  map 75% reduce 24%
17/05/18 03:07:17 INFO mapreduce.Job:  map 75% reduce 25%
17/05/18 03:07:41 INFO mapreduce.Job:  map 76% reduce 25%
17/05/18 03:07:42 INFO mapreduce.Job:  map 77% reduce 25%
17/05/18 03:07:47 INFO mapreduce.Job:  map 77% reduce 26%
17/05/18 03:08:15 INFO mapreduce.Job:  map 78% reduce 26%
17/05/18 03:08:51 INFO mapreduce.Job:  map 79% reduce 26%
17/05/18 03:08:52 INFO mapreduce.Job:  map 80% reduce 26%
17/05/18 03:08:56 INFO mapreduce.Job:  map 80% reduce 27%
17/05/18 03:09:23 INFO mapreduce.Job:  map 82% reduce 27%
17/05/18 03:09:55 INFO mapreduce.Job:  map 83% reduce 27%
17/05/18 03:10:01 INFO mapreduce.Job:  map 83% reduce 28%
17/05/18 03:10:21 INFO mapreduce.Job:  map 84% reduce 28%
17/05/18 03:10:23 INFO mapreduce.Job:  map 85% reduce 28%
17/05/18 03:10:57 INFO mapreduce.Job:  map 86% reduce 28%
17/05/18 03:11:01 INFO mapreduce.Job:  map 87% reduce 28%
17/05/18 03:11:02 INFO mapreduce.Job:  map 87% reduce 29%
17/05/18 03:11:29 INFO mapreduce.Job:  map 88% reduce 29%
17/05/18 03:11:56 INFO mapreduce.Job:  map 89% reduce 29%
17/05/18 03:11:57 INFO mapreduce.Job:  map 89% reduce 30%
17/05/18 03:11:58 INFO mapreduce.Job:  map 90% reduce 30%
17/05/18 03:12:27 INFO mapreduce.Job:  map 92% reduce 30%
17/05/18 03:12:34 INFO mapreduce.Job:  map 92% reduce 31%
17/05/18 03:13:00 INFO mapreduce.Job:  map 93% reduce 31%
17/05/18 03:13:28 INFO mapreduce.Job:  map 94% reduce 31%
17/05/18 03:13:30 INFO mapreduce.Job:  map 95% reduce 31%
17/05/18 03:13:35 INFO mapreduce.Job:  map 95% reduce 32%
17/05/18 03:14:00 INFO mapreduce.Job:  map 96% reduce 32%
17/05/18 03:14:02 INFO mapreduce.Job:  map 97% reduce 32%
17/05/18 03:14:34 INFO mapreduce.Job:  map 98% reduce 32%
17/05/18 03:14:37 INFO mapreduce.Job:  map 98% reduce 33%
17/05/18 03:15:03 INFO mapreduce.Job:  map 99% reduce 33%
17/05/18 03:15:05 INFO mapreduce.Job:  map 100% reduce 33%
17/05/18 03:15:08 INFO mapreduce.Job:  map 100% reduce 34%
17/05/18 03:15:14 INFO mapreduce.Job:  map 100% reduce 39%
17/05/18 03:15:20 INFO mapreduce.Job:  map 100% reduce 44%
17/05/18 03:15:26 INFO mapreduce.Job:  map 100% reduce 49%
17/05/18 03:15:32 INFO mapreduce.Job:  map 100% reduce 54%
17/05/18 03:15:39 INFO mapreduce.Job:  map 100% reduce 59%
17/05/18 03:15:44 INFO mapreduce.Job:  map 100% reduce 64%
17/05/18 03:15:50 INFO mapreduce.Job:  map 100% reduce 67%
17/05/18 03:15:56 INFO mapreduce.Job:  map 100% reduce 68%
17/05/18 03:16:03 INFO mapreduce.Job:  map 100% reduce 70%
17/05/18 03:16:08 INFO mapreduce.Job:  map 100% reduce 71%
17/05/18 03:16:15 INFO mapreduce.Job:  map 100% reduce 73%
17/05/18 03:16:21 INFO mapreduce.Job:  map 100% reduce 75%
17/05/18 03:16:27 INFO mapreduce.Job:  map 100% reduce 76%
17/05/18 03:16:33 INFO mapreduce.Job:  map 100% reduce 78%
17/05/18 03:16:39 INFO mapreduce.Job:  map 100% reduce 80%
17/05/18 03:16:44 INFO mapreduce.Job:  map 100% reduce 81%
17/05/18 03:16:51 INFO mapreduce.Job:  map 100% reduce 83%
17/05/18 03:16:57 INFO mapreduce.Job:  map 100% reduce 85%
17/05/18 03:17:04 INFO mapreduce.Job:  map 100% reduce 86%
17/05/18 03:17:10 INFO mapreduce.Job:  map 100% reduce 87%
17/05/18 03:17:15 INFO mapreduce.Job:  map 100% reduce 89%
17/05/18 03:17:22 INFO mapreduce.Job:  map 100% reduce 90%
17/05/18 03:17:28 INFO mapreduce.Job:  map 100% reduce 92%
17/05/18 03:17:33 INFO mapreduce.Job:  map 100% reduce 93%
17/05/18 03:17:39 INFO mapreduce.Job:  map 100% reduce 95%
17/05/18 03:17:46 INFO mapreduce.Job:  map 100% reduce 97%
17/05/18 03:17:52 INFO mapreduce.Job:  map 100% reduce 98%
17/05/18 03:17:59 INFO mapreduce.Job:  map 100% reduce 100%
17/05/18 03:18:02 INFO mapreduce.Job: Job job_1495100426727_0001 completed successfully
17/05/18 03:18:03 INFO mapreduce.Job: Counters: 50
	File System Counters
		FILE: Number of bytes read=7026323290
		FILE: Number of bytes written=12263214279
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=5000040500
		HDFS: Number of bytes written=5000000000
		HDFS: Number of read operations=903
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=2
	Job Counters 
		Killed map tasks=2
		Launched map tasks=300
		Launched reduce tasks=1
		Data-local map tasks=300
		Total time spent by all maps in occupied slots (ms)=9032992
		Total time spent by all reduces in occupied slots (ms)=1717284
		Total time spent by all map tasks (ms)=9032992
		Total time spent by all reduce tasks (ms)=1717284
		Total vcore-seconds taken by all map tasks=9032992
		Total vcore-seconds taken by all reduce tasks=1717284
		Total megabyte-seconds taken by all map tasks=9249783808
		Total megabyte-seconds taken by all reduce tasks=1758498816
	Map-Reduce Framework
		Map input records=50000000
		Map output records=50000000
		Map output bytes=5100000000
		Map output materialized bytes=5200001800
		Input split bytes=40500
		Combine input records=0
		Combine output records=0
		Reduce input groups=50000000
		Reduce shuffle bytes=5200001800
		Reduce input records=50000000
		Reduce output records=50000000
		Spilled Records=117560800
		Shuffled Maps =300
		Failed Shuffles=0
		Merged Map outputs=300
		GC time elapsed (ms)=120485
		CPU time spent (ms)=1275800
		Physical memory (bytes) snapshot=82059988992
		Virtual memory (bytes) snapshot=468775854080
		Total committed heap usage (bytes)=75363778560
	Shuffle Errors
		BAD_ID=0
		CONNECTION=0
		IO_ERROR=0
		WRONG_LENGTH=0
		WRONG_MAP=0
		WRONG_REDUCE=0
	File Input Format Counters 
		Bytes Read=5000000000
	File Output Format Counters 
		Bytes Written=5000000000
17/05/18 03:18:03 INFO terasort.TeraSort: done

real	34m45.402s
user	0m13.504s
sys	0m9.667s


