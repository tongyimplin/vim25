package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineStorageSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineStorageSummary", propOrder = {"committed", "uncommitted", "unshared", "timestamp"})
public class VirtualMachineStorageSummary extends DynamicData {
  protected long committed;
  
  protected long uncommitted;
  
  protected long unshared;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar timestamp;
  
  public long getCommitted() {
    return this.committed;
  }
  
  public void setCommitted(long paramLong) {
    this.committed = paramLong;
  }
  
  public long getUncommitted() {
    return this.uncommitted;
  }
  
  public void setUncommitted(long paramLong) {
    this.uncommitted = paramLong;
  }
  
  public long getUnshared() {
    return this.unshared;
  }
  
  public void setUnshared(long paramLong) {
    this.unshared = paramLong;
  }
  
  public XMLGregorianCalendar getTimestamp() {
    return this.timestamp;
  }
  
  public void setTimestamp(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.timestamp = paramXMLGregorianCalendar;
  }
}
