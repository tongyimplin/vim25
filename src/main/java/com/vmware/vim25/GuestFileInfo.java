package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestFileAttributes;
import com.vmware.vim25.GuestFileInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestFileInfo", propOrder = {"path", "type", "size", "attributes"})
public class GuestFileInfo extends DynamicData {
  @XmlElement(required = true)
  protected String path;
  
  @XmlElement(required = true)
  protected String type;
  
  protected long size;
  
  @XmlElement(required = true)
  protected GuestFileAttributes attributes;
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
  }
  
  public GuestFileAttributes getAttributes() {
    return this.attributes;
  }
  
  public void setAttributes(GuestFileAttributes paramGuestFileAttributes) {
    this.attributes = paramGuestFileAttributes;
  }
}
