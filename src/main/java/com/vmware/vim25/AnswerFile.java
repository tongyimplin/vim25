package com.vmware.vim25;

import com.vmware.vim25.AnswerFile;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFile", propOrder = {"userInput", "createdTime", "modifiedTime"})
public class AnswerFile extends DynamicData {
  protected List<ProfileDeferredPolicyOptionParameter> userInput;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createdTime;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar modifiedTime;
  
  public List<ProfileDeferredPolicyOptionParameter> getUserInput() {
    if (this.userInput == null)
      this.userInput = new ArrayList<>(); 
    return this.userInput;
  }
  
  public XMLGregorianCalendar getCreatedTime() {
    return this.createdTime;
  }
  
  public void setCreatedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createdTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getModifiedTime() {
    return this.modifiedTime;
  }
  
  public void setModifiedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.modifiedTime = paramXMLGregorianCalendar;
  }
}
