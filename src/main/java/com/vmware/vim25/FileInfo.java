package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FileInfo;
import com.vmware.vim25.FloppyImageFileInfo;
import com.vmware.vim25.FolderFileInfo;
import com.vmware.vim25.IsoImageFileInfo;
import com.vmware.vim25.VmConfigFileInfo;
import com.vmware.vim25.VmDiskFileInfo;
import com.vmware.vim25.VmLogFileInfo;
import com.vmware.vim25.VmNvramFileInfo;
import com.vmware.vim25.VmSnapshotFileInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileInfo", propOrder = {"path", "friendlyName", "fileSize", "modification", "owner"})
@XmlSeeAlso({VmSnapshotFileInfo.class, VmLogFileInfo.class, FloppyImageFileInfo.class, VmNvramFileInfo.class, VmDiskFileInfo.class, VmConfigFileInfo.class, IsoImageFileInfo.class, FolderFileInfo.class})
public class FileInfo extends DynamicData {
  @XmlElement(required = true)
  protected String path;
  
  protected String friendlyName;
  
  protected Long fileSize;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar modification;
  
  protected String owner;
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public String getFriendlyName() {
    return this.friendlyName;
  }
  
  public void setFriendlyName(String paramString) {
    this.friendlyName = paramString;
  }
  
  public Long getFileSize() {
    return this.fileSize;
  }
  
  public void setFileSize(Long paramLong) {
    this.fileSize = paramLong;
  }
  
  public XMLGregorianCalendar getModification() {
    return this.modification;
  }
  
  public void setModification(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.modification = paramXMLGregorianCalendar;
  }
  
  public String getOwner() {
    return this.owner;
  }
  
  public void setOwner(String paramString) {
    this.owner = paramString;
  }
}
