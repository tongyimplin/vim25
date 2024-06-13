package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ReplicationVmProgressInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationVmProgressInfo", propOrder = {"progress", "bytesTransferred", "bytesToTransfer", "checksumTotalBytes", "checksumComparedBytes"})
public class ReplicationVmProgressInfo extends DynamicData {
  protected int progress;
  
  protected long bytesTransferred;
  
  protected long bytesToTransfer;
  
  protected Long checksumTotalBytes;
  
  protected Long checksumComparedBytes;
  
  public int getProgress() {
    return this.progress;
  }
  
  public void setProgress(int paramInt) {
    this.progress = paramInt;
  }
  
  public long getBytesTransferred() {
    return this.bytesTransferred;
  }
  
  public void setBytesTransferred(long paramLong) {
    this.bytesTransferred = paramLong;
  }
  
  public long getBytesToTransfer() {
    return this.bytesToTransfer;
  }
  
  public void setBytesToTransfer(long paramLong) {
    this.bytesToTransfer = paramLong;
  }
  
  public Long getChecksumTotalBytes() {
    return this.checksumTotalBytes;
  }
  
  public void setChecksumTotalBytes(Long paramLong) {
    this.checksumTotalBytes = paramLong;
  }
  
  public Long getChecksumComparedBytes() {
    return this.checksumComparedBytes;
  }
  
  public void setChecksumComparedBytes(Long paramLong) {
    this.checksumComparedBytes = paramLong;
  }
}
