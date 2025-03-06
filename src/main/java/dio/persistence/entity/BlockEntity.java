package dio.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;


public class BlockEntity {

    private Long  id;
    private OffsetDateTime blockedat;
    private String blockReason;
    private OffsetDateTime unblockedat;
    private String unblockReason;

    public BlockEntity() {
    }

    public BlockEntity(OffsetDateTime blockedat, String blockReason, OffsetDateTime unblockedat, String unblockReason) {
        this.blockedat = blockedat;
        this.blockReason = blockReason;
        this.unblockedat = unblockedat;
        this.unblockReason = unblockReason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getBlockedat() {
        return blockedat;
    }

    public void setBlockedat(OffsetDateTime blockedat) {
        this.blockedat = blockedat;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public OffsetDateTime getUnblockedat() {
        return unblockedat;
    }

    public void setUnblockedat(OffsetDateTime unblockedat) {
        this.unblockedat = unblockedat;
    }

    public String getUnblockReason() {
        return unblockReason;
    }

    public void setUnblockReason(String unblockReason) {
        this.unblockReason = unblockReason;
    }
}
