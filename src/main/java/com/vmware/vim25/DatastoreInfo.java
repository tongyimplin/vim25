package com.vmware.vim25;

import com.vmware.vim25.DatastoreInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalDatastoreInfo;
import com.vmware.vim25.NasDatastoreInfo;
import com.vmware.vim25.PMemDatastoreInfo;
import com.vmware.vim25.VmfsDatastoreInfo;
import com.vmware.vim25.VvolDatastoreInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreInfo", propOrder = {"name", "url", "freeSpace", "maxFileSize", "maxVirtualDiskCapacity", "maxMemoryFileSize", "timestamp", "containerId", "aliasOf"})
@XmlSeeAlso({PMemDatastoreInfo.class, VmfsDatastoreInfo.class, VvolDatastoreInfo.class, LocalDatastoreInfo.class, NasDatastoreInfo.class})
public class DatastoreInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String url;
  
  protected long freeSpace;
  
  protected long maxFileSize;
  
  protected Long maxVirtualDiskCapacity;
  
  protected Long maxMemoryFileSize;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar timestamp;
  
  protected String containerId;
  
  protected String aliasOf;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
  
  public long getFreeSpace() {
    return this.freeSpace;
  }
  
  public void setFreeSpace(long paramLong) {
    this.freeSpace = paramLong;
  }
  
  public long getMaxFileSize() {
    return this.maxFileSize;
  }
  
  public void setMaxFileSize(long paramLong) {
    this.maxFileSize = paramLong;
  }
  
  public Long getMaxVirtualDiskCapacity() {
    return this.maxVirtualDiskCapacity;
  }
  
  public void setMaxVirtualDiskCapacity(Long paramLong) {
    this.maxVirtualDiskCapacity = paramLong;
  }
  
  public Long getMaxMemoryFileSize() {
    return this.maxMemoryFileSize;
  }
  
  public void setMaxMemoryFileSize(Long paramLong) {
    this.maxMemoryFileSize = paramLong;
  }
  
  public XMLGregorianCalendar getTimestamp() {
    return this.timestamp;
  }
  
  public void setTimestamp(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.timestamp = paramXMLGregorianCalendar;
  }
  
  public String getContainerId() {
    return this.containerId;
  }
  
  public void setContainerId(String paramString) {
    this.containerId = paramString;
  }
  
  public String getAliasOf() {
    return this.aliasOf;
  }
  
  public void setAliasOf(String paramString) {
    this.aliasOf = paramString;
  }
}
