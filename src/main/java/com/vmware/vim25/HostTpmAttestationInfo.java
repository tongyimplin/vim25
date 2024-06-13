package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostTpmAttestationInfo;
import com.vmware.vim25.HostTpmAttestationInfoAcceptanceStatus;
import com.vmware.vim25.LocalizableMessage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmAttestationInfo", propOrder = {"time", "status", "message"})
public class HostTpmAttestationInfo extends DynamicData {
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar time;
  
  @XmlElement(required = true)
  protected HostTpmAttestationInfoAcceptanceStatus status;
  
  protected LocalizableMessage message;
  
  public XMLGregorianCalendar getTime() {
    return this.time;
  }
  
  public void setTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.time = paramXMLGregorianCalendar;
  }
  
  public HostTpmAttestationInfoAcceptanceStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(HostTpmAttestationInfoAcceptanceStatus paramHostTpmAttestationInfoAcceptanceStatus) {
    this.status = paramHostTpmAttestationInfoAcceptanceStatus;
  }
  
  public LocalizableMessage getMessage() {
    return this.message;
  }
  
  public void setMessage(LocalizableMessage paramLocalizableMessage) {
    this.message = paramLocalizableMessage;
  }
}
