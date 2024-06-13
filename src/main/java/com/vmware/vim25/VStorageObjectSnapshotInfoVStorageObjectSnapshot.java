package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ID;
import com.vmware.vim25.VStorageObjectSnapshotInfoVStorageObjectSnapshot;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectSnapshotInfoVStorageObjectSnapshot", propOrder = {"id", "backingObjectId", "createTime", "description"})
public class VStorageObjectSnapshotInfoVStorageObjectSnapshot extends DynamicData {
  protected ID id;
  
  protected String backingObjectId;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createTime;
  
  @XmlElement(required = true)
  protected String description;
  
  public ID getId() {
    return this.id;
  }
  
  public void setId(ID paramID) {
    this.id = paramID;
  }
  
  public String getBackingObjectId() {
    return this.backingObjectId;
  }
  
  public void setBackingObjectId(String paramString) {
    this.backingObjectId = paramString;
  }
  
  public XMLGregorianCalendar getCreateTime() {
    return this.createTime;
  }
  
  public void setCreateTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createTime = paramXMLGregorianCalendar;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
