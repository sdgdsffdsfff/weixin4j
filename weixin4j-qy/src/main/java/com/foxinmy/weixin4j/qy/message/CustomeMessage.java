package com.foxinmy.weixin4j.qy.message;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.foxinmy.weixin4j.tuple.NotifyTuple;

/**
 * 客服消息对象
 * 
 * @className CustomeMessage
 * @author jy
 * @date 2015年11月20日
 * @since JDK 1.6
 * @see com.foxinmy.weixin4j.tuple.Text
 * @see com.foxinmy.weixin4j.tuple.Image
 * @see com.foxinmy.weixin4j.tuple.Voice
 * @see com.foxinmy.weixin4j.tuple.Video
 * @see com.foxinmy.weixin4j.tuple.File
 * @see <a
 *      href="http://qydev.weixin.qq.com/wiki/index.php?title=%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%9C%8D%E6%8E%A5%E5%8F%A3%E8%AF%B4%E6%98%8E">客服消息</a>
 */
public class CustomeMessage implements Serializable {

	private static final long serialVersionUID = -3620361273175868681L;

	private CustomeTarget sender;
	private CustomeTarget receiver;
	/**
	 * 消息对象
	 */
	@JSONField(serialize = false)
	private NotifyTuple tuple;

	public CustomeMessage(CustomeTarget sender, CustomeTarget receiver,
			NotifyTuple tuple) {
		this.sender = sender;
		this.receiver = receiver;
		this.tuple = tuple;
	}

	public CustomeTarget getSender() {
		return sender;
	}

	public CustomeTarget getReceiver() {
		return receiver;
	}

	public NotifyTuple getTuple() {
		return tuple;
	}

	/**
	 * 用户类型
	 * 
	 * @className CustomeIdType
	 * @author jy
	 * @date 2015年11月20日
	 * @since JDK 1.6
	 * @see
	 */
	public enum CustomeIdType {
		/**
		 * 客服
		 */
		kf,
		/**
		 * 企业员工userid
		 */
		userid,
		/**
		 * 公众号openid
		 */
		openid
	}

	/**
	 * 消息对象
	 * 
	 * @className CustomeTarget
	 * @author jy
	 * @date 2015年11月20日
	 * @since JDK 1.6
	 * @see
	 */
	public static class CustomeTarget implements Serializable {

		private static final long serialVersionUID = 1L;

		private CustomeIdType type;
		private String id;

		public CustomeTarget(CustomeIdType type, String id) {
			this.type = type;
			this.id = id;
		}

		public CustomeIdType getType() {
			return type;
		}

		public String getId() {
			return id;
		}
	}

	@Override
	public String toString() {
		return "CustomeMessage [sender=" + sender + ", receiver=" + receiver
				+ ", tuple=" + tuple + "]";
	}
}
