package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSubSpecification;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSubSpecification", propOrder = {"name", "createdTime", "data", "binaryData"})
public class HostSubSpecification extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createdTime;
  
  @XmlElement(type = Byte.class)
  protected List<Byte> data;
  
  protected byte[] binaryData;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public XMLGregorianCalendar getCreatedTime() {
    return this.createdTime;
  }
  
  public void setCreatedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createdTime = paramXMLGregorianCalendar;
  }
  
  public List<Byte> getData() {
    if (this.data == null)
      this.data = new ArrayList<>(); 
    return this.data;
  }
  
  public byte[] getBinaryData() {
    return this.binaryData;
  }
  
  public void setBinaryData(byte[] paramArrayOfbyte) {
    this.binaryData = paramArrayOfbyte;
  }
}
