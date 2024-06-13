package com.vmware.vim25;

import com.vmware.vim25.CustomFieldDefAddedEvent;
import com.vmware.vim25.CustomFieldDefEvent;
import com.vmware.vim25.CustomFieldDefRemovedEvent;
import com.vmware.vim25.CustomFieldDefRenamedEvent;
import com.vmware.vim25.CustomFieldEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldDefEvent", propOrder = {"fieldKey", "name"})
@XmlSeeAlso({CustomFieldDefRemovedEvent.class, CustomFieldDefAddedEvent.class, CustomFieldDefRenamedEvent.class})
public class CustomFieldDefEvent extends CustomFieldEvent {
  protected int fieldKey;
  
  @XmlElement(required = true)
  protected String name;
  
  public int getFieldKey() {
    return this.fieldKey;
  }
  
  public void setFieldKey(int paramInt) {
    this.fieldKey = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
