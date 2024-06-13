package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryDiskGroupOp;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryPreflightFail;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemUpgradeHistoryItem", propOrder = {"timestamp", "host", "message", "task"})
@XmlSeeAlso({VsanUpgradeSystemUpgradeHistoryDiskGroupOp.class, VsanUpgradeSystemUpgradeHistoryPreflightFail.class})
public class VsanUpgradeSystemUpgradeHistoryItem extends DynamicData {
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar timestamp;
  
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String message;
  
  protected ManagedObjectReference task;
  
  public XMLGregorianCalendar getTimestamp() {
    return this.timestamp;
  }
  
  public void setTimestamp(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.timestamp = paramXMLGregorianCalendar;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
  
  public ManagedObjectReference getTask() {
    return this.task;
  }
  
  public void setTask(ManagedObjectReference paramManagedObjectReference) {
    this.task = paramManagedObjectReference;
  }
}
