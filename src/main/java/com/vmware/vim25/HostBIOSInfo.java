package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostBIOSInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostBIOSInfo", propOrder = {"biosVersion", "releaseDate", "vendor", "majorRelease", "minorRelease", "firmwareMajorRelease", "firmwareMinorRelease"})
public class HostBIOSInfo extends DynamicData {
  protected String biosVersion;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar releaseDate;
  
  protected String vendor;
  
  protected Integer majorRelease;
  
  protected Integer minorRelease;
  
  protected Integer firmwareMajorRelease;
  
  protected Integer firmwareMinorRelease;
  
  public String getBiosVersion() {
    return this.biosVersion;
  }
  
  public void setBiosVersion(String paramString) {
    this.biosVersion = paramString;
  }
  
  public XMLGregorianCalendar getReleaseDate() {
    return this.releaseDate;
  }
  
  public void setReleaseDate(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.releaseDate = paramXMLGregorianCalendar;
  }
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public Integer getMajorRelease() {
    return this.majorRelease;
  }
  
  public void setMajorRelease(Integer paramInteger) {
    this.majorRelease = paramInteger;
  }
  
  public Integer getMinorRelease() {
    return this.minorRelease;
  }
  
  public void setMinorRelease(Integer paramInteger) {
    this.minorRelease = paramInteger;
  }
  
  public Integer getFirmwareMajorRelease() {
    return this.firmwareMajorRelease;
  }
  
  public void setFirmwareMajorRelease(Integer paramInteger) {
    this.firmwareMajorRelease = paramInteger;
  }
  
  public Integer getFirmwareMinorRelease() {
    return this.firmwareMinorRelease;
  }
  
  public void setFirmwareMinorRelease(Integer paramInteger) {
    this.firmwareMinorRelease = paramInteger;
  }
}
