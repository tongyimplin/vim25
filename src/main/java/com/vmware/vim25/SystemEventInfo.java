package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SystemEventInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventInfo", propOrder = {"recordId", "when", "selType", "message", "sensorNumber"})
public class SystemEventInfo extends DynamicData {
  protected long recordId;
  
  @XmlElement(required = true)
  protected String when;
  
  protected long selType;
  
  @XmlElement(required = true)
  protected String message;
  
  protected long sensorNumber;
  
  public long getRecordId() {
    return this.recordId;
  }
  
  public void setRecordId(long paramLong) {
    this.recordId = paramLong;
  }
  
  public String getWhen() {
    return this.when;
  }
  
  public void setWhen(String paramString) {
    this.when = paramString;
  }
  
  public long getSelType() {
    return this.selType;
  }
  
  public void setSelType(long paramLong) {
    this.selType = paramLong;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
  
  public long getSensorNumber() {
    return this.sensorNumber;
  }
  
  public void setSensorNumber(long paramLong) {
    this.sensorNumber = paramLong;
  }
}
