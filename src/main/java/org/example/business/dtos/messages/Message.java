package org.example.business.dtos.messages;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(Messages.MessageImpl.class)
public interface Message {
	public Object getMessage();

	public Integer getCode();

	public String getDescription();
}
