package org.accp.cfg;

public class AlipayConfig {
	
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String APP_ID = "2021000116697754";
	
	// 商户私钥，您的PKCS8格式RSA2私钥，这些就是我们刚才设置的
    public static String MERCHANT_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCogWmipPsqaIqDCp7AFBW0TRH3/bpJNwgxAxORvj5GwmsgU8S6jLaXPzkduDvkEVm3xnMPnpzZ+0LHa2xs2RObcRbJx9d2gPlmwXc9/sYJxam14tn8nl0r9FMaxhCnC6XjXb2nuH0V/Emnoa6dtKb3wajulq5HtcK1OmEvP8eJKI/itnzM3D4aI+g+otyKUEiPabQsSFMINbzzbSib+uoklxY17SFutzcK+AXnt9M+OCtcCYt1Obo0Hqd9fXiImLqpj5/NkbPC6zfWJj4VXytGn5dM1PcChTxsS6w424m16h9hR8+vZquy5h49YaZX7Ot9MgDqwzrvgDwy5eGX5uqDAgMBAAECggEAJgenFq0Tfpu/fxm7gHBIAbxPLOAX1gRUlfMyzHbaSVABq3ccdFnjr7j2JA37flqoHADu4PyUO+IoTSeifeJ0OWXJldrDdxxerWFGjzhb68Kvrbw4JHp9XrkytF01Tu4jD3CNqDfMC1U4LlwgM7mc4VfUz5w0UzzjZ9F4M5i6aOrfcJDRovih0o9YH4fiZ5sT2VLDEDOeXQRpCwcPDEDeNm7Nz2gnJqBUEfFSBLma7k35YOYH+gWLiIQyUewFDRw8LgiCGiQFCDKNk8V3JSuYZueJrCQNn7zWiaw13zc3MqAbytv8hmOgRV2WYX0vTo6yB9W2FqAV9VNScoU5rHk/EQKBgQDlTxkfuhFWL/ORc1ff0+sQE0tAOWZM+Vfe4d8dt+SEM9qdHJQ/Pbnv86c/oKbdWhOeoexmxuQVf6S4daviXWdttB3zMFGm1E69EbXdhY1E3de8Sq4mJlM7HQbkV27sx1EGDXoNpyrXmvIVw/UGSN/rKN26UT9xVPmMabZxdQKtewKBgQC8HoFoblQ60OHEWtOZUo43CpYczfQZvk18C/rfcWPXt3+8VhS7ppIGwNJTAbhm/9ZBLjmVCt7VN75WSXYdfw+zfFRM8VRZf4T/KqQTvRoHdWYtbw6kEjR+H/QVEOpY4WMKFGi1Te4AR9RCpQNPh6tA+3U/nmju18p8PvQRn5z0mQKBgQDJnzrgAqKrvY3UHi7tx0+v2scXuWCR3cu9VazwXHi5JT7bVf2jfYq3yO0NrRwLFOCbYpSR6d8yaAFVj2GKr8X5V53d7mZc4eA5rhDSrlMAcm72SFPHh3s3RtaAf8AwwTAkukTPLGUnHj4tlRckZ387LbuHz1iRNb4WD/0y1Ud9cQKBgFXyQgFqVsVAZcWGEaK9Gwh+p7KlTd7tGQ2Rk56+eXU2+v8a/QH2ykSXmAAgixVT0ZmZ+ujjPIeBnk5h5br4MD46kXFN2NHC9wp1et0hymCZ/ILJeJDxWFY/Vw7A2bCd2NfkFyquXgx2xL1mEqslOtLHj/vu7dYhdPtq76uVluoRAoGAV/+WAVEHRm9I6evofnI7GIf/FZ7sCQKxhktkryiOJc/GyYxDLs7AMfO0BBtDtKflcyPymNpSpB9ZwiAWwqH8VZUYIC3nFVeechff34yGRjZJ4XONHTZRzwOS+F8xYxQh+UcaWx/4O6Zs4VszD0it4cCo/aayxdhrRELpCvHkhEQ=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。，这些就是我们刚才设置的
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiRjRK2dhKmE40GUUXVbRm70N8jEj9ChQJGdBLLNfZuT3zIxCmAsdUR/Rnu5VRG1DRo4nVvFOBhY+TrVEHGm+Jlgp2nsb0qb0uiJDzKmb4wv1zriZaj6Qh4ZHCyO65Kd2p1pB1hoshaQtrUZb/aWb2bxkZQf+bOeRemiTL7Ypyo/vee0rvdyjMBLLC0PABStKSsG465GXQV7bvinjcAY9Vv0DFgEcjGjp8BSc1Eckjtfc1spRtyUtfnIMJP0G2JYG5/DeP/5HY8vpiWOsDk5WXC3YRxqp/aP5I9jJrYUrO+SH1tO0GyfSzoBrvnpsrlULVWe7gPoTgKOX2tmKuRBLdQIDAQAB";

    //异步通知，再这里我们设计自己的后台代码
    public static String notify_url = "http://127.0.0.1:8020/dzw/s.html?__hbt=1597144704954";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8020/dzw/index.html";

	// 签名方式
	public static String SIGN_TYPE = "RSA2";
	
	// 字符编码格式
	public static String CHARSET = "utf-8";
	
	// 支付宝网关
	public static String GATEWAYURL = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String LOG_PATH = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
}