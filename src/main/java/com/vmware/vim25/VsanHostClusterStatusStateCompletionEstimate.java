package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostClusterStatusStateCompletionEstimate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostClusterStatusStateCompletionEstimate", propOrder = {"completeTime", "percentComplete"})
public class VsanHostClusterStatusStateCompletionEstimate extends DynamicData {
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar completeTime;
  
  protected Integer percentComplete;
  
  public XMLGregorianCalendar getCompleteTime() {
    return this.completeTime;
  }
  
  public void setCompleteTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.completeTime = paramXMLGregorianCalendar;
  }
  
  public Integer getPercentComplete() {
    return this.percentComplete;
  }
  
  public void setPercentComplete(Integer paramInteger) {
    this.percentComplete = paramInteger;
  }
}
