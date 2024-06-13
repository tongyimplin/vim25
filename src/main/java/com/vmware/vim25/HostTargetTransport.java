package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostBlockAdapterTargetTransport;
import com.vmware.vim25.HostFibreChannelTargetTransport;
import com.vmware.vim25.HostInternetScsiTargetTransport;
import com.vmware.vim25.HostParallelScsiTargetTransport;
import com.vmware.vim25.HostPcieTargetTransport;
import com.vmware.vim25.HostRdmaTargetTransport;
import com.vmware.vim25.HostSerialAttachedTargetTransport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTargetTransport")
@XmlSeeAlso({HostInternetScsiTargetTransport.class, HostParallelScsiTargetTransport.class, HostSerialAttachedTargetTransport.class, HostPcieTargetTransport.class, HostFibreChannelTargetTransport.class, HostBlockAdapterTargetTransport.class, HostRdmaTargetTransport.class})
public class HostTargetTransport extends DynamicData {}
