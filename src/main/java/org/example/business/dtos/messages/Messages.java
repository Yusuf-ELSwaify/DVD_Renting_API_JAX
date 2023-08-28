package org.example.business.dtos.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import lombok.*;


public class Messages {
	public static final Message DELETED_SUCCESSFULLY_MESSAGE = new MessageImpl("Deleted", 200, "Deleted Successfully");
//	public static final Message SUCCESS_MESSAGE = new MessageImpl("Success", 200, "Success");
	public static Message createMessage(String message, int code, String description) {
		return new MessageImpl(message, code, description);
	}
	@Getter
	@Setter
	@NoArgsConstructor
	public static class MessageImpl extends XmlAdapter<MessageImpl, Message> implements Message {
		Object message;
		Integer code;
		String description;
		private MessageImpl(String message, Integer code, String description) {
			this.message = message;
			this.code = code;
			this.description = description;
		}

		@Override
		public Message unmarshal(MessageImpl message) throws Exception {
			return message;
		}

		@Override
		public MessageImpl marshal(Message message) throws Exception {
			return (MessageImpl) message;
		}
	}
}
