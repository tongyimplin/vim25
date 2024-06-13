package com.vmware.vim25;

import com.vmware.vim25.GuestFileAttributes;
import com.vmware.vim25.GuestPosixFileAttributes;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestPosixFileAttributes", propOrder = {"ownerId", "groupId", "permissions"})
public class GuestPosixFileAttributes extends GuestFileAttributes {
  protected Integer ownerId;
  
  protected Integer groupId;
  
  protected Long permissions;
  
  public Integer getOwnerId() {
    return this.ownerId;
  }
  
  public void setOwnerId(Integer paramInteger) {
    this.ownerId = paramInteger;
  }
  
  public Integer getGroupId() {
    return this.groupId;
  }
  
  public void setGroupId(Integer paramInteger) {
    this.groupId = paramInteger;
  }
  
  public Long getPermissions() {
    return this.permissions;
  }
  
  public void setPermissions(Long paramLong) {
    this.permissions = paramLong;
  }
}
