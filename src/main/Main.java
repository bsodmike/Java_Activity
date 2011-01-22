package main;

public class Main {

	public static void main(String[] args){
		try {
			@SuppressWarnings("unchecked")
			Class<Activity> activity = (Class<Activity>) Class.forName("main.MyActivity");
			try {
				Activity runningActivity = activity.newInstance();
				runningActivity.onCreate();
				System.out.println("Thread: " + Thread.currentThread().getName());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
