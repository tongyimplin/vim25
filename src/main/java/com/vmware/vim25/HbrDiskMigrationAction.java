package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.HbrDiskMigrationAction;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HbrDiskMigrationAction", propOrder = {"collectionId", "collectionName", "diskIds", "source", "destination", "sizeTransferred", "spaceUtilSrcBefore", "spaceUtilDstBefore", "spaceUtilSrcAfter", "spaceUtilDstAfter", "ioLatencySrcBefore", "ioLatencyDstBefore"})
public class HbrDiskMigrationAction extends ClusterAction {
  @XmlElement(required = true)
  protected String collectionId;
  
  @XmlElement(required = true)
  protected String collectionName;
  
  @XmlElement(required = true)
  protected List<String> diskIds;
  
  @XmlElement(required = true)
  protected ManagedObjectReference source;
  
  @XmlElement(required = true)
  protected ManagedObjectReference destination;
  
  protected long sizeTransferred;
  
  protected Float spaceUtilSrcBefore;
  
  protected Float spaceUtilDstBefore;
  
  protected Float spaceUtilSrcAfter;
  
  protected Float spaceUtilDstAfter;
  
  protected Float ioLatencySrcBefore;
  
  protected Float ioLatencyDstBefore;
  
  public String getCollectionId() {
    return this.collectionId;
  }
  
  public void setCollectionId(String paramString) {
    this.collectionId = paramString;
  }
  
  public String getCollectionName() {
    return this.collectionName;
  }
  
  public void setCollectionName(String paramString) {
    this.collectionName = paramString;
  }
  
  public List<String> getDiskIds() {
    if (this.diskIds == null)
      this.diskIds = new ArrayList<>(); 
    return this.diskIds;
  }
  
  public ManagedObjectReference getSource() {
    return this.source;
  }
  
  public void setSource(ManagedObjectReference paramManagedObjectReference) {
    this.source = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDestination() {
    return this.destination;
  }
  
  public void setDestination(ManagedObjectReference paramManagedObjectReference) {
    this.destination = paramManagedObjectReference;
  }
  
  public long getSizeTransferred() {
    return this.sizeTransferred;
  }
  
  public void setSizeTransferred(long paramLong) {
    this.sizeTransferred = paramLong;
  }
  
  public Float getSpaceUtilSrcBefore() {
    return this.spaceUtilSrcBefore;
  }
  
  public void setSpaceUtilSrcBefore(Float paramFloat) {
    this.spaceUtilSrcBefore = paramFloat;
  }
  
  public Float getSpaceUtilDstBefore() {
    return this.spaceUtilDstBefore;
  }
  
  public void setSpaceUtilDstBefore(Float paramFloat) {
    this.spaceUtilDstBefore = paramFloat;
  }
  
  public Float getSpaceUtilSrcAfter() {
    return this.spaceUtilSrcAfter;
  }
  
  public void setSpaceUtilSrcAfter(Float paramFloat) {
    this.spaceUtilSrcAfter = paramFloat;
  }
  
  public Float getSpaceUtilDstAfter() {
    return this.spaceUtilDstAfter;
  }
  
  public void setSpaceUtilDstAfter(Float paramFloat) {
    this.spaceUtilDstAfter = paramFloat;
  }
  
  public Float getIoLatencySrcBefore() {
    return this.ioLatencySrcBefore;
  }
  
  public void setIoLatencySrcBefore(Float paramFloat) {
    this.ioLatencySrcBefore = paramFloat;
  }
  
  public Float getIoLatencyDstBefore() {
    return this.ioLatencyDstBefore;
  }
  
  public void setIoLatencyDstBefore(Float paramFloat) {
    this.ioLatencyDstBefore = paramFloat;
  }
}
