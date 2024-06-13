package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestProcessInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestProcessInfo", propOrder = {"name", "pid", "owner", "cmdLine", "startTime", "endTime", "exitCode"})
public class GuestProcessInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected long pid;
  
  @XmlElement(required = true)
  protected String owner;
  
  @XmlElement(required = true)
  protected String cmdLine;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar startTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endTime;
  
  protected Integer exitCode;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public long getPid() {
    return this.pid;
  }
  
  public void setPid(long paramLong) {
    this.pid = paramLong;
  }
  
  public String getOwner() {
    return this.owner;
  }
  
  public void setOwner(String paramString) {
    this.owner = paramString;
  }
  
  public String getCmdLine() {
    return this.cmdLine;
  }
  
  public void setCmdLine(String paramString) {
    this.cmdLine = paramString;
  }
  
  public XMLGregorianCalendar getStartTime() {
    return this.startTime;
  }
  
  public void setStartTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.startTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getEndTime() {
    return this.endTime;
  }
  
  public void setEndTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.endTime = paramXMLGregorianCalendar;
  }
  
  public Integer getExitCode() {
    return this.exitCode;
  }
  
  public void setExitCode(Integer paramInteger) {
    this.exitCode = paramInteger;
  }
}
