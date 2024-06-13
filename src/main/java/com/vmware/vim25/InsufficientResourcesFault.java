package com.vmware.vim25;

import com.vmware.vim25.InsufficientAgentVmsDeployed;
import com.vmware.vim25.InsufficientCpuResourcesFault;
import com.vmware.vim25.InsufficientFailoverResourcesFault;
import com.vmware.vim25.InsufficientGraphicsResourcesFault;
import com.vmware.vim25.InsufficientHostCapacityFault;
import com.vmware.vim25.InsufficientMemoryResourcesFault;
import com.vmware.vim25.InsufficientNetworkCapacity;
import com.vmware.vim25.InsufficientNetworkResourcePoolCapacity;
import com.vmware.vim25.InsufficientStandbyResource;
import com.vmware.vim25.InsufficientStorageSpace;
import com.vmware.vim25.InsufficientVFlashResourcesFault;
import com.vmware.vim25.InvalidResourcePoolStructureFault;
import com.vmware.vim25.NumVirtualCpusExceedsLimit;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VmFaultToleranceTooManyFtVcpusOnHost;
import com.vmware.vim25.VmFaultToleranceTooManyVMsOnHost;
import com.vmware.vim25.VmSmpFaultToleranceTooManyVMsOnHost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientResourcesFault")
@XmlSeeAlso({InsufficientGraphicsResourcesFault.class, InsufficientAgentVmsDeployed.class, InsufficientNetworkCapacity.class, VmFaultToleranceTooManyFtVcpusOnHost.class, VmFaultToleranceTooManyVMsOnHost.class, InsufficientStorageSpace.class, NumVirtualCpusExceedsLimit.class, VmSmpFaultToleranceTooManyVMsOnHost.class, InsufficientMemoryResourcesFault.class, InsufficientHostCapacityFault.class, InsufficientVFlashResourcesFault.class, InsufficientCpuResourcesFault.class, InvalidResourcePoolStructureFault.class, InsufficientNetworkResourcePoolCapacity.class, InsufficientFailoverResourcesFault.class, InsufficientStandbyResource.class})
public class InsufficientResourcesFault extends VimFault {}
