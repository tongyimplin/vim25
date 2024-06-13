package com.vmware.vim25;

import com.vmware.vim25.AnswerFileStatusError;
import com.vmware.vim25.AnswerFileStatusResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileStatusResult", propOrder = {"checkedTime", "host", "status", "error"})
public class AnswerFileStatusResult extends DynamicData {
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar checkedTime;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String status;
  
  protected List<AnswerFileStatusError> error;
  
  public XMLGregorianCalendar getCheckedTime() {
    return this.checkedTime;
  }
  
  public void setCheckedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.checkedTime = paramXMLGregorianCalendar;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public List<AnswerFileStatusError> getError() {
    if (this.error == null)
      this.error = new ArrayList<>(); 
    return this.error;
  }
}
