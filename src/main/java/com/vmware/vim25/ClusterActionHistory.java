package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ClusterActionHistory;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterActionHistory", propOrder = {"action", "time"})
public class ClusterActionHistory extends DynamicData {
  @XmlElement(required = true)
  protected ClusterAction action;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar time;
  
  public ClusterAction getAction() {
    return this.action;
  }
  
  public void setAction(ClusterAction paramClusterAction) {
    this.action = paramClusterAction;
  }
  
  public XMLGregorianCalendar getTime() {
    return this.time;
  }
  
  public void setTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.time = paramXMLGregorianCalendar;
  }
}
