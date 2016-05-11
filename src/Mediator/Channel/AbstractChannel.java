package Mediator.Channel;

public abstract class AbstractChannel {
    protected ChannelMediatorInterface mediator;
    protected IRCChannel channel;

    public AbstractChannel(ChannelMediatorInterface mediator, IRCChannel channel) {
        this.mediator = mediator;
        this.channel = channel;
    }
}
