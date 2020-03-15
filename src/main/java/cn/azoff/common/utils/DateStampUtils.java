package cn.azoff.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * 日期工具类
 * 
 * @version 2020-02-18 21:20:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class DateStampUtils {
	/** 1s==1000ms */
	private final static int TIME_MILLISECONDS = 1000;
	/** 时间中的分、秒最大值均为60 */
	private final static int TIME_NUMBERS = 60;
	/** 时间中的小时最大值 */
	private final static int TIME_HOURSES = 24;
	/** 格式化日期的标准字符串 */
	private final static String FORMAT = "yyyy-MM-dd HH:mm:ss";
	/** 一天时间-1秒  */
	private final static Integer DAY_TIME = 1000*60*60*24-1000;
	
	/**
	 * 获取时区信息
	 * @return
	 */
	public static TimeZone getTimeZone() {
		return TimeZone.getDefault();
	}

	/**
	 * 将日期字符串转换为Date对象
	 * 
	 * @param date 日期字符串，必须为"yyyy-MM-dd HH:mm:ss"
	 * @return 日期字符串的Date对象表达形式
	 */
	public static Date parseDate(String date) {
		return parseDate(date, FORMAT);
	}

	/**
	 * 将日期字符串转换为Date对象
	 * 
	 * @param date 日期字符串，必须为"yyyy-MM-dd HH:mm:ss"
	 * @param format 格式化字符串
	 * @return 日期字符串的Date对象表达形式
	 */
	public static Date parseDate(String date, String format) {
		Date dt = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		try {
			dt = dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dt;
	}

	/**
	 * 将Date对象转换为指定格式的字符串
	 * 
	 * @param date Date对象
	 * @return Date对象的字符串表达形式"yyyy-MM-dd HH:mm:ss"
	 */
	public static String formatDate(Date date) {
		return formatDate(date, FORMAT);
	}

	/**
	 * 将Date对象转换为指定格式的字符串
	 * 
	 * @param date Date对象
	 * @param format format 格式化字符串
	 * @return Date对象的字符串表达形式
	 */
	public static String formatDate(Date date, String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(date);
	}

	/**
	 * 格式化日期
	 * 
	 * @param unixTime unix时间戳
	 * @return 日期字符串"yyyy-MM-dd HH:mm:ss"
	 */
	public static String formatUnixTime(long unixTime) {
		return formatUnixTime(unixTime, FORMAT);
	}

	/**
	 * 格式化日期
	 * 
	 * @param unixTime unix时间戳
	 * @param format 格式化字符串
	 * @return 日期字符串
	 */
	public static String formatUnixTime(long unixTime, String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(unixTime);
	}

	/**
	 * 将GMT日期格式化为系统默认时区的日期字符串表达形式
	 * 
	 * @param gmtUnixTime GTM时间戳
	 * @return 日期字符串"yyyy-MM-dd HH:mm:ss"
	 */
	public static String formatGMTUnixTime(long gmtUnixTime) {
		return formatGMTUnixTime(gmtUnixTime, FORMAT);
	}

	/**
	 * 将GMT日期格式化为系统默认时区的日期字符串表达形式
	 * 
	 * @param gmtUnixTime GTM时间戳
	 * @param format 格式化字符串
	 * @return 日期字符串"yyyy-MM-dd HH:mm:ss"
	 */
	public static String formatGMTUnixTime(long gmtUnixTime, String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(gmtUnixTime
				+ TimeZone.getDefault().getRawOffset());
	}

	/**
	 * 获取时间戳的Date表示形式
	 * 
	 * @param unixTime unix时间戳
	 * @return Date对象
	 */
	public static Date getDate(long unixTime) {
		return new Date(unixTime);
	}

	/**
	 * 获取GMT时间戳的Date表示形式（转换为Date表示形式后，为系统默认时区下的时间）
	 * 
	 * @param gmtUnixTime GMT Unix时间戳
	 * @return Date对象
	 */
	public static Date getGMTDate(long gmtUnixTime) {
		return new Date(gmtUnixTime + TimeZone.getDefault().getRawOffset());
	}

	/**
	 * 将系统默认时区的Unix时间戳转换为GMT Unix时间戳
	 * 
	 * @param unixTime unix时间戳
	 * @return GMT Unix时间戳
	 */
	public static long getGMTUnixTime(long unixTime) {
		return unixTime - TimeZone.getDefault().getRawOffset();
	}

	/**
	 * 将GMT Unix时间戳转换为系统默认时区的Unix时间戳
	 * 
	 * @param gmtUnixTime GMT Unix时间戳
	 * @return 系统默认时区的Unix时间戳
	 */
	public static long getCurrentTimeZoneUnixTime(long gmtUnixTime) {
		return gmtUnixTime + TimeZone.getDefault().getRawOffset();
	}

	/**
	 * 获取当前时间的GMT Unix时间戳(世界标准时)
	 * 
	 * @return 当前的GMT Unix时间戳
	 */
	public static long getGMTUnixTimeByCalendar() {
		Calendar calendar = Calendar.getInstance();
		// 获取当前时区下日期时间对应的时间戳
		long unixTime = calendar.getTimeInMillis();
		// 获取标准格林尼治时间下日期时间对应的时间戳
		long unixTimeGMT = unixTime - TimeZone.getDefault().getRawOffset();
		return unixTimeGMT;
	}
	
	/**
	 * 获取当前时间的Unix时间戳
	 * 
	 * @return 当前的Unix时间戳
	 */
	public static long getUnixTimeByCalendar() {
		Calendar calendar = Calendar.getInstance();
		// 获取当前时区下日期时间对应的时间戳
		long unixTime = calendar.getTimeInMillis();
		return unixTime;
	}
	
	/**
	 * 获取更改时区后的时间
	 * 
	 * @param date 时间
	 * @param oldZone 旧时区
	 * @param newZone 新时区
	 * @return 时间
	 */
	public static Date changeTimeZone(Date date, TimeZone oldZone,
			TimeZone newZone) {
		Date dateTmp = null;
		if (date != null) {
			int timeOffset = oldZone.getRawOffset() - newZone.getRawOffset();
			dateTmp = new Date(date.getTime() - timeOffset);
		}
		return dateTmp;
	}

	/**
	 * 将总秒数转换为时分秒表达形式
	 * 
	 * @param seconds 任意秒数
	 * @return %s小时%s分%s秒
	 */
	public static String formatTime(long seconds) {
		long hh = seconds / TIME_NUMBERS / TIME_NUMBERS;
		long mm = (seconds - hh * TIME_NUMBERS * TIME_NUMBERS) > 0 ? (seconds - hh
				* TIME_NUMBERS * TIME_NUMBERS)
				/ TIME_NUMBERS
				: 0;
		long ss = seconds < TIME_NUMBERS ? seconds : seconds % TIME_NUMBERS;
		return (hh == 0 ? "" : (hh < 10 ? "0" + hh : hh) + "小时")
				+ (mm == 0 ? "" : (mm < 10 ? "0" + mm : mm) + "分")
				+ (ss == 0 ? "" : (ss < 10 ? "0" + ss : ss) + "秒");
	}
	
	
	public static String formatTimeDay(long seconds) {
		long day=seconds/TIME_NUMBERS/TIME_NUMBERS/TIME_HOURSES;
		long hh = (seconds%(TIME_NUMBERS*TIME_NUMBERS*TIME_HOURSES)) / TIME_NUMBERS / TIME_NUMBERS;
//		long mm = (seconds - hh * TIME_NUMBERS * TIME_NUMBERS) > 0 ? (seconds - hh
//				* TIME_NUMBERS * TIME_NUMBERS)
//				/ TIME_NUMBERS
//				: 0;
		long mm = (seconds%(TIME_NUMBERS*TIME_NUMBERS*TIME_HOURSES)%(TIME_NUMBERS*TIME_NUMBERS ))/TIME_NUMBERS;
//		long ss = seconds < TIME_NUMBERS ? seconds : seconds % TIME_NUMBERS;
		long ss =(seconds%(TIME_NUMBERS*TIME_NUMBERS*TIME_HOURSES)%(TIME_NUMBERS * TIME_NUMBERS)%(TIME_NUMBERS));
		return (day==0?"":(day +"天"))+ (hh == 0 ? "" : hh + "小时")
				+ (mm == 0 ? "" : mm + "分")
				+ (ss == 0 ? "" : ss + "秒");
	}
	
	/**
	 * 获取当前时间距离指定日期时差的大致表达形式
	 * 
	 * @param date 日期
	 * @return 时差的大致表达形式
	 */
	public static String getDiffTime(long date) {
//		date=getCurrentTimeZoneUnixTime(date);
//		String strTime = "很久以前";
//		String strTime = Calendar.;
		String strTime=formatUnixTime(date);
		
			
//			Date targetDate=getDate(date);
//			Date curDate=new Date();
			Calendar curCalendar=Calendar.getInstance();
			Calendar targetCalendar=Calendar.getInstance();
			targetCalendar.setTimeInMillis(date);
			//是否今年
			if(curCalendar.get(Calendar.YEAR)==targetCalendar.get(Calendar.YEAR)){
				//是否为当月
				if(curCalendar.get(Calendar.MONTH)==targetCalendar.get(Calendar.MONTH)){
					// 是否为当天
					if(curCalendar.get(Calendar.DAY_OF_MONTH)==targetCalendar.get(Calendar.DAY_OF_MONTH)){
						long time = Math.abs(new Date().getTime() - date);
						// 一小时以内
						if (time < TIME_NUMBERS*TIME_NUMBERS * TIME_MILLISECONDS) {
//							strTime = "刚刚";
							int min = (int) (time / TIME_MILLISECONDS / TIME_NUMBERS);
							if(min<1){
								strTime = "刚刚";//"刚刚";
							}else{
								strTime=min+ "分钟前";//"分钟前";
							}
						}else{
							//int hour = (int) (time / TIME_MILLISECONDS / TIME_NUMBERS/TIME_NUMBERS);
							//strTime=hour+ "小时前";
							strTime="今天"+formatUnixTime(date, "HH:mm");
						}
					}else{
						curCalendar.add(Calendar.DAY_OF_MONTH, -1);
						//是否昨天
						if(curCalendar.get(Calendar.DAY_OF_MONTH)==targetCalendar.get(Calendar.DAY_OF_MONTH)){
							strTime="昨天"+formatUnixTime(date, "HH:mm");
						}else{
							curCalendar.add(Calendar.DAY_OF_MONTH, -1);
							//是否前天
							if(curCalendar.get(Calendar.DAY_OF_MONTH)==targetCalendar.get(Calendar.DAY_OF_MONTH)){
								strTime="前天"+formatUnixTime(date, "HH:mm");
							}else{
								strTime=formatUnixTime(date, "M-d HH:mm");
							}
						}
					}
				}else{
					strTime=formatUnixTime(date, "M-d HH:mm");
				}
			}else{
				strTime=formatUnixTime(date, "yyyy-M-d HH:mm");
			}
				
		/*if(strTime.startsWith("0")){
			strTime = strTime.substring(1,strTime.length());
		}*/
		return strTime;
	}
	/**
	 * 传入当前系统时间当天的开始时间
	 * 
	 * @param today 格式必须为"yyyy-MM-dd"
	 * @return GMT格式的,当天的开始时间
	 */
	public static long getGMTStartTime(String today){
		return getGMTUnixTime(parseDate(today + " 00:00:00").getTime());
	}
	
	/**
	 * 传入当前系统时间当天的结束时间
	 * 
	 * @param today 格式必须为"yyyy-MM-dd"
	 * @return GMT格式的,当天的结束时间
	 */
	public static long getGMTEndTime(String today){
		return getGMTUnixTime(parseDate(today).getTime()+DAY_TIME);
	}
	
	/**
	 * 传入当前需要转为GMT时间的日期
	 * 
	 * @param calcTime 格式必须为"yyyy-MM-dd HH:mm:ss"
	 * @return GMT格式的,要获得的时间
	 */
	public static long getGMTTime(String calcTime){
		return getGMTUnixTime(parseDate(calcTime).getTime());
	}
	
	/**
	 * 获得GMT时间
	 * 
	 * @return
	 */
	public static String getGMTCurrentTime(){
		return formatGMTUnixTime(getGMTUnixTimeByCalendar());
	}
	/**
	 * 获得Unix时间
	 * 
	 * @return
	 */
	public static String getUnixCurrentTime(){
		return formatUnixTime(getUnixTimeByCalendar());
	}
	
	/**
	 * 获得当前的系统时间
	 * <br>格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getSystemTime(){
		return formatUnixTime(getUnixTimeByCalendar());
	}
	/**
	 * 获得当前系统的日期
	 * <br>格式为yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String getSystemDateStr(){
		return formatUnixTime(getUnixTimeByCalendar(),"yyyy-MM-dd");
	}
	
	public static long getTime(){
		Calendar now = Calendar.getInstance();
		int second = now.get(Calendar.SECOND);
		int min = now.get(Calendar.MINUTE);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		long time = hour * 60 * 60 + min * 60 + second;
		return time;
	}
	public static long getTime(int second,int min,int hour){
		long time = hour * 60 * 60 + min * 60 + second;
		return time;
	}
	
	public static void main(String args[]){
//		long time = 1511807427327L;
//		long dev = time-29*60*1000;
//		System.out.println(formatGMTUnixTime(time));
//		System.out.println(dev+"---"+formatGMTUnixTime(dev));
		
//		System.out.println(getTime());
//		System.out.println(getTime(1,43,10));
//		System.out.println(getTime(1,48,10));
//		System.out.println(formatGMTUnixTime(1517007290804L));
//		System.out.println(formatGMTUnixTime(1517086143252L));
		
		System.out.println(getGMTUnixTimeByCalendar());
		System.out.println(formatGMTUnixTime(1528078757430L));
	}
}
