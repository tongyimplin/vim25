package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestFileAttributes;
import com.vmware.vim25.GuestPosixFileAttributes;
import com.vmware.vim25.GuestWindowsFileAttributes;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestFileAttributes", propOrder = {"modificationTime", "accessTime", "symlinkTarget"})
@XmlSeeAlso({GuestWindowsFileAttributes.class, GuestPosixFileAttributes.class})
public class GuestFileAttributes extends DynamicData {
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar modificationTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar accessTime;
  
  protected String symlinkTarget;
  
  public XMLGregorianCalendar getModificationTime() {
    return this.modificationTime;
  }
  
  public void setModificationTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.modificationTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getAccessTime() {
    return this.accessTime;
  }
  
  public void setAccessTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.accessTime = paramXMLGregorianCalendar;
  }
  
  public String getSymlinkTarget() {
    return this.symlinkTarget;
  }
  
  public void setSymlinkTarget(String paramString) {
    this.symlinkTarget = paramString;
  }
}
