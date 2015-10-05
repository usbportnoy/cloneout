const React = require('react');
const Dialog = require('material-ui/lib/dialog');
const TextField = require('material-ui/lib/text-field');
const RaisedButton = require('material-ui/lib/raised-button');

const NewTagDialog = React.createClass({
    render(){

        let standardActions = [
            { text: 'Cancel' },
            { text: 'Submit', onTouchTap: this._onDialogSubmit, ref: 'submit' },
        ];

        return <div>
            <Dialog
                title="New Tag Name"
                actions={standardActions}
                ref="newTagDialog">
                <TextField
                    hintText="Android" />
            </Dialog>
            <RaisedButton label="New Tag" secondary={true} onTouchTap={this._handleTouchTap}/>
        </div>;
    },

    _handleTouchTap() {
        this.refs.newTagDialog.show();
    },

    _onDialogSubmit(){

    },
});

module.exports = NewTagDialog;