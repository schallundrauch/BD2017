import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;


public class WordCount {

	public static void main(String[] args) throws Exception {
		
		
	    if (args.length != 2) {
	        System.out.printf("Usage: WordCount <input dir> <output dir>\n");
	        System.exit(-1);
	      }
	    
	    Job job = new Job();
	    job.setJarByClass(WordCount.class);    
	    job.setJobName("Word Count");
	    
	    FileInputFormat.addInputPath(job, new Path(args[0]));
	    FileOutputFormat.setOutputPath(job, new Path(args[1]));
	    
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(IntWritable.class);
	    job.setOutputFormatClass(TextOutputFormat.class);
	    
	    
	    job.setMapperClass(WordCountMapper.class);
	    job.setReducerClass(WordCountReducer.class);
	    job.waitForCompletion(true);
	}
}
