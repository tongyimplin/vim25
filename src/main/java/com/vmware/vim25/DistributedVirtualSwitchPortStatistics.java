package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortStatistics;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchPortStatistics", propOrder = {"packetsInMulticast", "packetsOutMulticast", "bytesInMulticast", "bytesOutMulticast", "packetsInUnicast", "packetsOutUnicast", "bytesInUnicast", "bytesOutUnicast", "packetsInBroadcast", "packetsOutBroadcast", "bytesInBroadcast", "bytesOutBroadcast", "packetsInDropped", "packetsOutDropped", "packetsInException", "packetsOutException", "bytesInFromPnic", "bytesOutToPnic"})
public class DistributedVirtualSwitchPortStatistics extends DynamicData {
  protected long packetsInMulticast;
  
  protected long packetsOutMulticast;
  
  protected long bytesInMulticast;
  
  protected long bytesOutMulticast;
  
  protected long packetsInUnicast;
  
  protected long packetsOutUnicast;
  
  protected long bytesInUnicast;
  
  protected long bytesOutUnicast;
  
  protected long packetsInBroadcast;
  
  protected long packetsOutBroadcast;
  
  protected long bytesInBroadcast;
  
  protected long bytesOutBroadcast;
  
  protected long packetsInDropped;
  
  protected long packetsOutDropped;
  
  protected long packetsInException;
  
  protected long packetsOutException;
  
  protected Long bytesInFromPnic;
  
  protected Long bytesOutToPnic;
  
  public long getPacketsInMulticast() {
    return this.packetsInMulticast;
  }
  
  public void setPacketsInMulticast(long paramLong) {
    this.packetsInMulticast = paramLong;
  }
  
  public long getPacketsOutMulticast() {
    return this.packetsOutMulticast;
  }
  
  public void setPacketsOutMulticast(long paramLong) {
    this.packetsOutMulticast = paramLong;
  }
  
  public long getBytesInMulticast() {
    return this.bytesInMulticast;
  }
  
  public void setBytesInMulticast(long paramLong) {
    this.bytesInMulticast = paramLong;
  }
  
  public long getBytesOutMulticast() {
    return this.bytesOutMulticast;
  }
  
  public void setBytesOutMulticast(long paramLong) {
    this.bytesOutMulticast = paramLong;
  }
  
  public long getPacketsInUnicast() {
    return this.packetsInUnicast;
  }
  
  public void setPacketsInUnicast(long paramLong) {
    this.packetsInUnicast = paramLong;
  }
  
  public long getPacketsOutUnicast() {
    return this.packetsOutUnicast;
  }
  
  public void setPacketsOutUnicast(long paramLong) {
    this.packetsOutUnicast = paramLong;
  }
  
  public long getBytesInUnicast() {
    return this.bytesInUnicast;
  }
  
  public void setBytesInUnicast(long paramLong) {
    this.bytesInUnicast = paramLong;
  }
  
  public long getBytesOutUnicast() {
    return this.bytesOutUnicast;
  }
  
  public void setBytesOutUnicast(long paramLong) {
    this.bytesOutUnicast = paramLong;
  }
  
  public long getPacketsInBroadcast() {
    return this.packetsInBroadcast;
  }
  
  public void setPacketsInBroadcast(long paramLong) {
    this.packetsInBroadcast = paramLong;
  }
  
  public long getPacketsOutBroadcast() {
    return this.packetsOutBroadcast;
  }
  
  public void setPacketsOutBroadcast(long paramLong) {
    this.packetsOutBroadcast = paramLong;
  }
  
  public long getBytesInBroadcast() {
    return this.bytesInBroadcast;
  }
  
  public void setBytesInBroadcast(long paramLong) {
    this.bytesInBroadcast = paramLong;
  }
  
  public long getBytesOutBroadcast() {
    return this.bytesOutBroadcast;
  }
  
  public void setBytesOutBroadcast(long paramLong) {
    this.bytesOutBroadcast = paramLong;
  }
  
  public long getPacketsInDropped() {
    return this.packetsInDropped;
  }
  
  public void setPacketsInDropped(long paramLong) {
    this.packetsInDropped = paramLong;
  }
  
  public long getPacketsOutDropped() {
    return this.packetsOutDropped;
  }
  
  public void setPacketsOutDropped(long paramLong) {
    this.packetsOutDropped = paramLong;
  }
  
  public long getPacketsInException() {
    return this.packetsInException;
  }
  
  public void setPacketsInException(long paramLong) {
    this.packetsInException = paramLong;
  }
  
  public long getPacketsOutException() {
    return this.packetsOutException;
  }
  
  public void setPacketsOutException(long paramLong) {
    this.packetsOutException = paramLong;
  }
  
  public Long getBytesInFromPnic() {
    return this.bytesInFromPnic;
  }
  
  public void setBytesInFromPnic(Long paramLong) {
    this.bytesInFromPnic = paramLong;
  }
  
  public Long getBytesOutToPnic() {
    return this.bytesOutToPnic;
  }
  
  public void setBytesOutToPnic(Long paramLong) {
    this.bytesOutToPnic = paramLong;
  }
}
