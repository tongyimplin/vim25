package com.vmware.vim25;

import com.vmware.vim25.GuestFileAttributes;
import com.vmware.vim25.GuestWindowsFileAttributes;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestWindowsFileAttributes", propOrder = {"hidden", "readOnly", "createTime"})
public class GuestWindowsFileAttributes extends GuestFileAttributes {
  protected Boolean hidden;
  
  protected Boolean readOnly;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createTime;
  
  public Boolean isHidden() {
    return this.hidden;
  }
  
  public void setHidden(Boolean paramBoolean) {
    this.hidden = paramBoolean;
  }
  
  public Boolean isReadOnly() {
    return this.readOnly;
  }
  
  public void setReadOnly(Boolean paramBoolean) {
    this.readOnly = paramBoolean;
  }
  
  public XMLGregorianCalendar getCreateTime() {
    return this.createTime;
  }
  
  public void setCreateTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createTime = paramXMLGregorianCalendar;
  }
}
