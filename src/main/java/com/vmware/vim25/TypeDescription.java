package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.ScheduledTaskDetail;
import com.vmware.vim25.TypeDescription;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeDescription", propOrder = {"key"})
@XmlSeeAlso({ScheduledTaskDetail.class})
public class TypeDescription extends Description {
  @XmlElement(required = true)
  protected String key;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
}
