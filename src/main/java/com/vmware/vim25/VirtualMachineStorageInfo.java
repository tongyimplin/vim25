package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineStorageInfo;
import com.vmware.vim25.VirtualMachineUsageOnDatastore;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineStorageInfo", propOrder = {"perDatastoreUsage", "timestamp"})
public class VirtualMachineStorageInfo extends DynamicData {
  protected List<VirtualMachineUsageOnDatastore> perDatastoreUsage;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar timestamp;
  
  public List<VirtualMachineUsageOnDatastore> getPerDatastoreUsage() {
    if (this.perDatastoreUsage == null)
      this.perDatastoreUsage = new ArrayList<>(); 
    return this.perDatastoreUsage;
  }
  
  public XMLGregorianCalendar getTimestamp() {
    return this.timestamp;
  }
  
  public void setTimestamp(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.timestamp = paramXMLGregorianCalendar;
  }
}
