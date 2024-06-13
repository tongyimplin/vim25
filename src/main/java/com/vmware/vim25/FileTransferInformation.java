package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FileTransferInformation;
import com.vmware.vim25.GuestFileAttributes;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransferInformation", propOrder = {"attributes", "size", "url"})
public class FileTransferInformation extends DynamicData {
  @XmlElement(required = true)
  protected GuestFileAttributes attributes;
  
  protected long size;
  
  @XmlElement(required = true)
  protected String url;
  
  public GuestFileAttributes getAttributes() {
    return this.attributes;
  }
  
  public void setAttributes(GuestFileAttributes paramGuestFileAttributes) {
    this.attributes = paramGuestFileAttributes;
  }
  
  public long getSize() {
    return this.size;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
}
