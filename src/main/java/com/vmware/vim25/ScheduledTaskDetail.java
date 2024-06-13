package com.vmware.vim25;

import com.vmware.vim25.ScheduledTaskDetail;
import com.vmware.vim25.TypeDescription;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskDetail", propOrder = {"frequency"})
public class ScheduledTaskDetail extends TypeDescription {
  @XmlElement(required = true)
  protected String frequency;
  
  public String getFrequency() {
    return this.frequency;
  }
  
  public void setFrequency(String paramString) {
    this.frequency = paramString;
  }
}
