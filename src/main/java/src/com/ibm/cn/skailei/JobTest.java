package src.com.ibm.cn.skailei;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerMetaData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobTest {
	
	public static void main(String args[]){
		try {
			testJob();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public static void testJob() throws InterruptedException, SchedulerException {  
        // 方法一：基于spring配置job、trigger、scheduler之间的关联关系  
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Scheduler scheduler = (Scheduler) context.getBean("myscheduler");  
        scheduler.start();
//        Thread.sleep(20000);// 等待20秒  
//        scheduler.shutdown();// 关闭调度程序  
   
        SchedulerMetaData metaData = scheduler.getMetaData();  
       System.out.println("Executed " + metaData.getNumberOfJobsExecuted() + " jobs.");  
    }  

}
